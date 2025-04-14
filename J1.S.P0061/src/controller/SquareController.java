/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.SquareView;
import model.Square;
/**
 *
 * @author NguyenDucAnh
 */
public class SquareController {
        
    private SquareView view = new SquareView();
    
    public void displayAll(Square s){
        view.printSquare(s);
    }
}
