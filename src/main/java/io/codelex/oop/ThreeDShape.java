package io.codelex.oop;

public abstract class ThreeDShape extends Shape {

    @Override
    public int calculatePerimiter() {
        return 0;
    }

    @Override
    public int calculateArea() {
        return 0;
    }

    public abstract int calculateVolume();
}
