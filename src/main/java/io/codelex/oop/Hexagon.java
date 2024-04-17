package io.codelex.oop;

import java.util.Objects;

public class Hexagon extends Shape {
    private int sideA;

    public Hexagon(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int calculatePerimiter() {
        return sideA * 6;
    }

    @Override
    public int calculateArea() {
        return (int) ((double) (6 * (sideA * sideA)) / (4 * Math.tan(Math.PI / 6)));
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "sideA=" + sideA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return sideA == hexagon.sideA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA);
    }
}
