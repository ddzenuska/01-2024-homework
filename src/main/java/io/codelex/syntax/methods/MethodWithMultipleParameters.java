package io.codelex.syntax.methods;

import java.util.Scanner;

public class MethodWithMultipleParameters {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter length : ");
        double l = s.nextDouble();
        System.out.print("enter breadth : ");
        double b = s.nextDouble();
        Rectangle rec = new Rectangle();
        //todo - create method: rec.calculateArea(l, b);
    }
}

class Rectangle {
    double width;
    double height;
    double depth;

    /*
    todo - wrap this code in a method 
    double ar = x * y;
    System.out.print("area of the rectangle is :"+ar);
    */
}
