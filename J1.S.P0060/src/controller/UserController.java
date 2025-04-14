/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import view.StatusView;
import model.UserWallet;
/**
 *
 * @author NguyenDucAnh
 */
public class UserController {
    
    private static List<Integer> billList = new ArrayList<>();
    private static UserWallet wa = new UserWallet();
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("input number of bill: ");
        int numberBills = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<numberBills; i++){
            System.out.printf("input value of bill %d: ",(i+1));
            int bill = sc.nextInt();
            billList.add(bill);
            sc.nextLine();
        }
        
        System.out.print("input value of wallet: ");
        int wallet = sc.nextInt();
        wa = new UserWallet(wallet);
        sc.nextLine();
    }
    
    // in ra trạng thái khả năng mua
    public void displayAll(){
        StatusView st = new StatusView();
        st.printStatusView(wa, (ArrayList<Integer>) billList);
    }
    
    
}
