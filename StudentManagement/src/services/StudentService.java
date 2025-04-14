/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import model.Student;
/**
 *
 * @author NguyenDucAnh
 */
public class StudentService {

    public static double calculateAverageMark(Student student) {
        ArrayList<Double> marks = student.getMarks();
        if (marks == null || marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.size();
    }
}
