package io.codelex.oop;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle recOne = new Rectangle(10, 15);
        Rectangle recTwo = new Rectangle(10, 15);
        Triangle triOne = new Triangle(5, 9);
        Hexagon hexOne = new Hexagon(7);

        System.out.println(recOne.calculateArea());
        System.out.println(recOne.calculatePerimiter());
        System.out.println(recOne.equals(recTwo));
        System.out.println(recOne + "\n");

        hexOne.setSideA(5);
        System.out.println(hexOne.calculateArea());
        System.out.println(hexOne.calculatePerimiter());
        System.out.println(hexOne + "\n");

        System.out.println(triOne.hashCode());
        System.out.println(triOne);
    }
}
