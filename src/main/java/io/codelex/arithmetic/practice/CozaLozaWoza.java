package io.codelex.arithmetic.practice;

/* Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5,
"Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.*/
public class CozaLozaWoza {
    public static void main(String[] args) {

        for (int i = 1; i <= 110; i++) { // iterating from 1 to 110.
            if (i % 11 == 0) { /* if the num modulo 11 equals 0, moves to the next line after printing current "i",
                so that 11 numbers print per line in the terminal.*/
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza "); // print statement without "ln", so each prints on the same line until i % 11 == 0.
            } else if (i % 3 == 0 && i % 7 == 0) { // added another condition.
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) { // added another condition.
                System.out.print("LozaWoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " "); // if it's a simple number, it gets printed with a space after it.
            }
        }
    }
}
