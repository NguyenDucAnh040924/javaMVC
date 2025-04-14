/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Triangle extends Shape {

    private double canh1;
    private double canh2;
    private double canh3;

    public Triangle() {
    }

    public Triangle(double canh1, double canh2, double canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh3() {
        return canh3;
    }

    public void setCanh3(double canh3) {
        this.canh3 = canh3;
    }

    @Override
    public double getDienTich() {
        double getDienTich = (getCanh1() + getCanh2() + getCanh3()) / 200;
        return getDienTich;
    }

    @Override
    public double getChuVi() {
        double getChuVi = getCanh1() + getCanh2() + getCanh3();
        return getChuVi;
    }

}
