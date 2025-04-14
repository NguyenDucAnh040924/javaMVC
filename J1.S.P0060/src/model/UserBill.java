/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author NguyenDucAnh
 */
public class UserBill {

    private int bill;

    public UserBill() {
    }

    public UserBill(int bill) {
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill(ArrayList<Integer> billList){
        int sum = 0;
        for (Integer o : billList){
            sum += o;
        }
        
        return sum;
    }
    
    
    @Override
    public String toString() {
        return "UserBill{" + "bill=" + bill + '}';
    }

}
