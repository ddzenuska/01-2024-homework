package io.codelex.enums;

public enum CardinalPoints {
    North("Up"),
    South("Down"),
    East("Right"),
    West("Left");
    private final String direction;

    CardinalPoints(String input) {
        this.direction = input;
    }

    public String getText() {
        return direction;
    }
}
