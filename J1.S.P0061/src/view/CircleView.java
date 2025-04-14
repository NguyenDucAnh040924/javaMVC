/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Circle;

/**
 *
 * @author NguyenDucAnh
 */
public class CircleView {

    public void printCircle(Circle c) {
        System.out.println("Dien tich Hinh Tron la: " + c.getDienTich());
        System.out.println("Chu vi Hinh Tron la: " + c.getChuVi());
    }

}
