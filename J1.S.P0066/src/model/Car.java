package model;

import java.util.Arrays;
import java.util.List;

public enum Car {
    AUDI(Arrays.asList(Color.WHITE, Color.YELLOW, Color.ORANGE), Arrays.asList(5500, 3000, 4500), Arrays.asList(Day.FRIDAY, Day.SUNDAY, Day.MONDAY)),
    MERCEDES(Arrays.asList(Color.GREEN, Color.BLUE, Color.PURPLE), Arrays.asList(5000, 6000, 8500), Arrays.asList(Day.TUESDAY, Day.SATURDAY, Day.WEDNESDAY)),
    BMW(Arrays.asList(Color.PINK, Color.RED, Color.BROWN), Arrays.asList(2500, 3000, 3500), Arrays.asList(Day.MONDAY, Day.SUNDAY, Day.THURSDAY));

    private final List<Color> colors;
    private final List<Integer> prices;
    private final List<Day> days;

    Car(List<Color> colors, List<Integer> prices, List<Day> days) {
        this.colors = colors;
        this.prices = prices;
        this.days = days;
    }

    public List<Color> getColors() {
        return colors;
    }

    public List<Integer> getPrices() {
        return prices;
    }

    public List<Day> getDaySells() {
        return days;
    }

    public static Car getCar(String name) {
        for (Car c : Car.values()) {
            if (c.name().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
