package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int result = 0;
        for (i = 1; i <= n; i++) {
            result = 1;
            for (int j = 1; j <= n; j++) {
                /* for every "i" iteration, "j" iterates fully, multiplying itself (current
                value) by 1. The value grows with every iteration.*/
                result *= i;
            }
        }
        System.out.println("\n\t" + (i - 1) + "^" + n + " = " + result + " "); // prints the full result, instead of value on each iteration.
        // wrote (i - 1) so the input value is printed correctly, instead of being larger by one.
    }

}
