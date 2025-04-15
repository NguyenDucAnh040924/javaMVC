package model;

public enum Color {
    WHITE, YELLOW, ORANGE, GREEN, BLUE, PURPLE, PINK, RED, BROWN, NOCOLOR;

    public static Color getColor(String name) {
        for (Color c : Color.values()) {
            if (c.name().equalsIgnoreCase(name)) return c;
        }
        return null;
    }
}
