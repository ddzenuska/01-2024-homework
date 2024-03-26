package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (width * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return (width + height) + ((int) Math.sqrt((width * width) + (height * height)));

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
