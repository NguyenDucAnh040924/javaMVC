/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import controller.UserController;
/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        UserController uc = new UserController();
        uc.input();
        
        uc.displayAll();
    }
    
}
