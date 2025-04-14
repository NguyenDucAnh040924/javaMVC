/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author NguyenDucAnh
 */
public class StudentView {

    public void printStudent(Student s) {
        System.out.println("\nID: " + s.getId());
        System.out.println("Tên: " + s.getName());
        System.out.println("Tuổi: " + s.getAge());
        System.out.println("Điểm: " + s.getMarks());
    }

    public void printAllStudents(ArrayList<Student> list) {
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        for (Student s : list) {
            printStudent(s);
        }
    }
}
