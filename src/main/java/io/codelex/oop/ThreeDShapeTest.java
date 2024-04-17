package io.codelex.oop;

public class ThreeDShapeTest {
    public static void main(String[] args) {
        Cone coneOne = new Cone(3.5, 10);
        Cube cubeOne = new Cube(20);
        Cube cubeTwo = new Cube(5);

        System.out.println(coneOne);
        System.out.println(coneOne.getHeight());
        System.out.println(coneOne.getRadius());
        System.out.println(coneOne.calculateArea());
        System.out.println(coneOne.calculateVolume() + "\n");

        System.out.println(cubeOne);
        System.out.println(cubeOne.getSideLength());
        System.out.println(cubeOne.calculateArea());
        System.out.println(cubeOne.calculateVolume() + "\n");

        System.out.println(cubeTwo);
        System.out.println(cubeTwo.equals(cubeOne));
        System.out.println(cubeTwo.getSideLength());
        System.out.println(cubeTwo.calculateArea());
        System.out.println(cubeTwo.calculateVolume() + "\n");
    }
}
