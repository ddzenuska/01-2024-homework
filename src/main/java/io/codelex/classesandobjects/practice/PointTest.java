package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Point.swapPoints;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(10, 4);
        Point p2 = new Point(67, -2);

        swapPoints(p1, p2);

        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }
}
