/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Circle;
import view.CircleView;

/**
 *
 * @author NguyenDucAnh
 */
public class CircleController {

    CircleView view = new CircleView();

    public void displayAll(Circle c) {
        view.printCircle(c);
    }

}
