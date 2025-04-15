package model;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static Day getDay(String name) {
        for (Day d : Day.values()) {
            if (d.name().equalsIgnoreCase(name)) return d;
        }
        return null;
    }
}
