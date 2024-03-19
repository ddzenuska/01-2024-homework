package io.codelex.enums;

public class CardinalPointTest {
    public static void main(String[] args) {
        for (CardinalPoints point : CardinalPoints.values()) {
            System.out.println(point + ":" + point.getText() + ":" + point.ordinal());
        }
    }
}
