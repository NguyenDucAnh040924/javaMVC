/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Square extends Shape{
    private double canhHinhVuong;

    public Square() {
    }

    public Square(double canhHinhVuong) {
        this.canhHinhVuong = canhHinhVuong;
    }

    public double getCanhHinhVuong() {
        return canhHinhVuong;
    }

    public void setCanhHinhVuong(double canhHinhVuong) {
        this.canhHinhVuong = canhHinhVuong;
    }
    
    @Override
    public double getDienTich(){
        double getDienTich = canhHinhVuong * 2;
        return getDienTich;
    }
    
    @Override
    public double getChuVi(){
        double getChuVi = canhHinhVuong * 4;
        return getChuVi;
    }
}
