/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.TriangleView;
import model.Triangle;
/**
 *
 * @author NguyenDucAnh
 */
public class TriangleController {
        
    private TriangleView view = new TriangleView();
    
    public void displayAll(Triangle t){
        view.printTriangle(t);
    }
}
