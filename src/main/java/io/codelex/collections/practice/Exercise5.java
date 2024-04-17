package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int input = scanner.nextInt();
        Set<Integer> visited = new HashSet<>();

        while (input != 1 && !visited.contains(input)) { /* while the input hasn't become 1 (a happy number) or
        the visited HashSet doesn't contain user input number, the loop continues.*/
            visited.add(input);
            input = nextNumber(input);
        }

        if (input == 1) {
            System.out.println("A happy number.");
        } else {
            System.out.println("Not a happy number.");
        }
    }

    public static int nextNumber(int num) { /* gets the last digit from input number, squares the digit
    and overrides input until it has become zero.*/
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
