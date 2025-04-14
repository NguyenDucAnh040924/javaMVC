/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author NguyenDucAnh
 */

import controller.CircleController;
import controller.SquareController;
import controller.TriangleController;
import java.util.Scanner;
import model.Circle;
import model.Square;
import model.Triangle;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircleController ci = new CircleController();
        SquareController sq = new SquareController();
        TriangleController tc = new TriangleController();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("Diện tích và Chu Vi");
            System.out.println("1. Hình Tròn");
            System.out.println("2. Hình Vuông");
            System.out.println("3. Tam Giác");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nhập bán kính: ");
                    double banKinh = sc.nextDouble();
                    sc.nextLine(); // clear buffer
                    if (banKinh <= 0) {
                        System.out.println("Bán kính phải lớn hơn 0!");
                        break;
                    }
                    Circle c = new Circle(banKinh);
                    ci.displayAll(c);
                    break;

                case "2":
                    System.out.print("Nhập cạnh: ");
                    double canhHinhVuong = sc.nextDouble();
                    sc.nextLine(); // clear buffer
                    if (canhHinhVuong <= 0) {
                        System.out.println("Cạnh phải lớn hơn 0!");
                        break;
                    }
                    Square s = new Square(canhHinhVuong);
                    sq.displayAll(s);
                    break;

                case "3":
                    System.out.print("Nhập cạnh 1: ");
                    double canh1 = sc.nextDouble();
                    System.out.print("Nhập cạnh 2: ");
                    double canh2 = sc.nextDouble();
                    System.out.print("Nhập cạnh 3: ");
                    double canh3 = sc.nextDouble();
                    sc.nextLine(); // clear buffer

                    if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0) {
                        System.out.println("Các cạnh phải lớn hơn 0!");
                        break;
                    }

                    if (canh1 + canh2 > canh3 && canh2 + canh3 > canh1 && canh3 + canh1 > canh2) {
                        Triangle t = new Triangle(canh1, canh2, canh3);
                        tc.displayAll(t);
                    } else {
                        System.out.println("Đây không phải là tam giác hợp lệ!");
                    }
                    break;

                case "5":
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
