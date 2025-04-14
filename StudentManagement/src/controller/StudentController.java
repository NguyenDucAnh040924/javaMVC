/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.Student;
import view.StudentView;
/**
 *
 * @author NguyenDucAnh
 */
public class StudentController {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentView view = new StudentView();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayAll() {
        view.printAllStudents(students);
    }

    public void updateStudent(String id, Student updated) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, updated);
                return;
            }
        }
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }
}