package io.codelex.classesandobjects.practice;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point valueOne, Point valueTwo) {
        int xValue = valueOne.x;
        int yValue = valueOne.y;

        valueOne.x = valueTwo.x;
        valueOne.y = valueTwo.y;

        valueTwo.x = xValue;
        valueTwo.y = yValue;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
