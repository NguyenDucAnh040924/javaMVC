package view;

import java.util.Scanner;
import model.*;

public class CarView {

    Scanner sc = new Scanner(System.in);

    public String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public void display(String msg) {
        System.out.println(msg);
    }
}
