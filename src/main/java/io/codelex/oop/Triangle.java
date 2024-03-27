package io.codelex.oop;

import java.util.Objects;

public class Triangle extends Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculatePerimiter() {
        return (width + height) + ((int) Math.sqrt((width * width) + (height * height)));
    }

    @Override
    public int calculateArea() {
        return (width * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && width == triangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }
}
