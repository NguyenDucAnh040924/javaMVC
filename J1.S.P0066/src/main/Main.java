package main;

import controller.CarController;
import model.*;
import view.CarView;

public class Main {
    public static void main(String[] args) {
        CarView view = new CarView();
        CarController controller = new CarController();

        try {
            String carName = view.input("Enter car brand (AUDI, MERCEDES, BMW): ");
            String colorName = view.input("Enter car color (or NOCOLOR): ");
            String priceStr = view.input("Enter car price: ");
            String dayName = view.input("Enter day of purchase: ");

            Car car = Car.getCar(carName);
            Color color = Color.getColor(colorName);
            Day day = Day.getDay(dayName);
            int price = Integer.parseInt(priceStr);

            Car matchedCar = controller.checkCar(car, color, day, price);

            int finalPrice = controller.getFinalPrice(color, price);
            view.display("Car matched! Final price: $" + finalPrice);
        } catch (ExceptionCar e) {
            System.out.println("❌ Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("❌ Unexpected Error: " + e.getMessage());
        }
    }
}
