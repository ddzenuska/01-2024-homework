package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a min number: ");
        int minNumber = input.nextInt();

        System.out.print("Please enter a max number: ");
        int maxNumber = input.nextInt();

        int arrSize = maxNumber - minNumber + 1; // "+1" make numbers inclusive.
        int myArray[] = new int[arrSize]; // initialized with the size of the array.
        int sum = 0;

        for (int i = 0; i < arrSize; i++) {
            myArray[i] += minNumber + i; // starts from minNum value and adds "i" one each iteration until arrSize.
            sum += myArray[i];
        }

        System.out.println("The sum is " + sum);
    }
}
