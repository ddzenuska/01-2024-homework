package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nI will find the largest number. Please provide three integers.\n"); // intro for the user.

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        System.out.println(compare(num1, num2, num3)); // printing out method call and its returned result.
    }

    public static String compare(int a, int b, int c) {

        int[] numbers = {a, b, c}; // creates an array with the numbers(thought this would be more effective than if statement).
        int result = numbers[0]; // declares a variable and assigns it the first "numbers" array element.

        for (int num : numbers) { // "for each" loop iterates through each value of the array as "num".
            if (result < num) { // if "result" current element is smaller than the iterated "num",
                // result is assigned that element and compared again until "result" is bigger.
                result = num;
            }
        }

        return "\n\tThe largest number is: " + result + "."; // returns result message.
    }


}
