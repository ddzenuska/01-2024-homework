package io.codelex.oop.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle one = new Rectangle(4, 5, 4);
        Triangle two = new Triangle(3, 3, 4);

        System.out.println(one);
        System.out.println(two);

        System.out.println(one.getArea());
        System.out.println(one.getPerimeter());

        System.out.println(two.getArea());
        System.out.println(two.getPerimeter());
    }
}
