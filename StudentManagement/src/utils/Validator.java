/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author NguyenDucAnh
 */
public class Validator {
    public static void validateId(String id) throws Exception {
        if (id == null || id.trim().isEmpty()) {
            throw new Exception("ID không được để trống!");
        }
    }

    public static void validateName(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Tên không được để trống!");
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 0 || age > 150) {
            throw new Exception("Tuổi phải từ 0 đến 150!");
        }
    }

    public static void validateMark(double mark) throws Exception {
        if (mark < 0 || mark > 10) {
            throw new Exception("Điểm phải từ 0 đến 10!");
        }
    }
}