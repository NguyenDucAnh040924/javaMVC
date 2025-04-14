/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.UserController;
import model.User;
import view.UserView;

/**
 *
 * @author NguyenDucAnh
 */
public class Main {

    public static void main(String[] args) {
        User model = new User("Alice");
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.updateView();  // Output: User: Alice

        controller.setUserName("Bob");
        controller.updateView();  // Output: User: Bob
    }
}
