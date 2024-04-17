package io.codelex.oop;

import java.util.Objects;

public class Cube extends ThreeDShape {
    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int calculateVolume() {
        return (int) Math.pow(sideLength, 3);
    }

    @Override
    public int calculatePerimiter() {
        return (12 * sideLength);
    }

    @Override
    public int calculateArea() {
        return (6 * (sideLength * sideLength));
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideLength=" + sideLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return sideLength == cube.sideLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideLength);
    }
}
