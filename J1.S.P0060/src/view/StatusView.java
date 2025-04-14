/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.UserBill;
import model.UserWallet;

/**
 *
 * @author NguyenDucAnh
 */
public class StatusView {

    public void printStatusView(UserWallet wallet, ArrayList<Integer> billList) {
        UserBill bill = new UserBill();
        if (wallet.getWallet() >= bill.getTotalBill(billList)) {
            System.out.printf("this is total of bill:%d\nYou can buy it.\n", bill.getTotalBill(billList));

        } else {
            System.out.printf("this is total of bill:%d\nYou can't buy it.\n", bill.getTotalBill(billList));
        }
    }

}
