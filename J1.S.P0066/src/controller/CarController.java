package controller;

import model.*;

public class CarController {

    public Car checkCar(Car car, Color color, Day day, int price) throws ExceptionCar {
        if (car == null || color == null || day == null)
            throw new ExceptionCar("Invalid input: Car, Color or Day is null!");

        if (!car.getColors().contains(color))
            throw new ExceptionCar("Color not available for " + car.name());

        if (!car.getPrices().contains(price))
            throw new ExceptionCar("Price not available for " + car.name());

        if (!car.getDaySells().contains(day))
            throw new ExceptionCar("Day not available for " + car.name());

        return car;
    }

    public int getFinalPrice(Color color, int basePrice) {
        if (color == Color.NOCOLOR) {
            return basePrice - 100;
        }
        return basePrice;
    }
}
