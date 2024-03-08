package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hi! I output numbers in a square pattern in the range from your provided min to max.\n");

        System.out.print("Min: ");
        int min = in.nextInt();
        System.out.print("Max: ");
        int max = in.nextInt();

        System.out.println("\nResult: ");
        for (int i = min; i <= max; i++) { // as the current row
            for (int j = i; j <= max; j++) { // prints increasing number sequence - shorter num "list" by each iteration.
                System.out.print(j);
            }
            for (int j = min; j < i; j++) { // as "i" increases, "j" can increase by one as well.
                System.out.print(j); // prints decreasing number sequence - printing first num at the end of the printed list.
            }
            System.out.println();
        }
    }
}
