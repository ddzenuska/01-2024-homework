package io.codelex.oop;

import java.util.Objects;

public class Cone extends ThreeDShape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int calculateVolume() {
        return (int) ((Math.PI * radius * radius * height) / 3);
    }

    @Override
    public int calculateArea() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return (int) ((Math.PI * radius * radius) + (Math.PI * radius * slantHeight));
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Double.compare(radius, cone.radius) == 0 && Double.compare(height, cone.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }
}
