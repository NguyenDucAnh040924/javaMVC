/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NguyenDucAnh
 */
public class Circle extends Shape{

    private double banKinh;

    private enum PiNumber {
        PI(3.14);

        private double piValue;

        PiNumber(double piValue) {
            this.piValue = piValue;
        }

        public double getPiValue() {
            return piValue;
        }

    }

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    
    @Override
    public double getDienTich(){
        double getDienTich = Math.pow(getBanKinh(), (double)2) * PiNumber.PI.getPiValue();
        return getDienTich;
    }
    
    @Override
    public double getChuVi(){
        double getChuVi = getBanKinh() * 2 * PiNumber.PI.getPiValue();
        return getChuVi;
    }

}
