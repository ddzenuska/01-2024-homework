package io.codelex.classesandobjects.practice;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(10, 4);
        Point p2 = new Point(67, -2);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    public static void swapPoints(Point valueOne, Point valueTwo) {
        int xValue = valueOne.x;
        int yValue = valueOne.y;

        valueOne.x = valueTwo.x;
        valueOne.y = valueTwo.y;

        valueTwo.x = xValue;
        valueTwo.y = yValue;
    }
}
