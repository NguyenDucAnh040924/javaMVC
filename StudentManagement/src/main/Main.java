/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.StudentController;
import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import services.StudentService;
import utils.Validator;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController controller = new StudentController();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xoá sinh viên");
            System.out.println("5. Tính điểm trung bình");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> {
                    try {
                        System.out.print("ID: ");
                        String id = sc.nextLine();
                        Validator.validateId(id);

                        System.out.print("Tên: ");
                        String name = sc.nextLine();
                        Validator.validateName(name);

                        System.out.print("Tuổi: ");
                        int age = Integer.parseInt(sc.nextLine());
                        Validator.validateAge(age);

                        ArrayList<Double> marks = new ArrayList<>();
                        while (true) {
                            System.out.print("Nhập điểm (hoặc 'x' để dừng): ");
                            String m = sc.nextLine();
                            if (m.equalsIgnoreCase("x")) break;
                            double mark = Double.parseDouble(m);
                            Validator.validateMark(mark);
                            marks.add(mark);
                        }

                        controller.addStudent(new Student(id, name, age, marks));
                        System.out.println("✅ Thêm thành công!");
                    } catch (Exception e) {
                        System.out.println("❌ Lỗi: " + e.getMessage());
                    }
                }
                case "2" -> controller.displayAll();
                case "3" -> {
                    System.out.print("Nhập ID cần sửa: ");
                    String uid = sc.nextLine();
                    Student s = controller.findById(uid);
                    if (s == null) {
                        System.out.println("❌ Không tìm thấy!");
                        break;
                    }
                    try {
                        System.out.print("Tên mới: ");
                        String newName = sc.nextLine();
                        Validator.validateName(newName);

                        System.out.print("Tuổi mới: ");
                        int newAge = Integer.parseInt(sc.nextLine());
                        Validator.validateAge(newAge);

                        ArrayList<Double> newMarks = new ArrayList<>();
                        while (true) {
                            System.out.print("Nhập điểm mới (hoặc 'x'): ");
                            String m = sc.nextLine();
                            if (m.equalsIgnoreCase("x")) break;
                            double mark = Double.parseDouble(m);
                            Validator.validateMark(mark);
                            newMarks.add(mark);
                        }

                        controller.updateStudent(uid, new Student(uid, newName, newAge, newMarks));
                        System.out.println("✅ Cập nhật thành công!");
                    } catch (Exception e) {
                        System.out.println("❌ Lỗi: " + e.getMessage());
                    }
                }
                case "4" -> {
                    System.out.print("Nhập ID cần xoá: ");
                    controller.deleteStudent(sc.nextLine());
                    System.out.println("✅ Đã xoá!");
                }
                case "5" -> {
                    System.out.print("Nhập ID cần tính điểm TB: ");
                    Student st = controller.findById(sc.nextLine());
                    if (st != null) {
                        double avg = StudentService.calculateAverageMark(st);
                        System.out.printf("✅ Điểm trung bình: %.2f\n", avg);
                    } else {
                        System.out.println("❌ Không tìm thấy!");
                    }
                }
                case "6" -> System.exit(0);
                default -> System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }
}
