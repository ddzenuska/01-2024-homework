package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UpperCaseCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialized scanner obj.
        String inputStr; // declared a string variable which will hold the users input.
        System.out.println("Hello! This program counts the amount of uppercase letters in a provided text. If you" +
                "\nwould like to quit this program, please type the word exit."); // the program introduces itself.

        do {
            System.out.print("Provide your text: ");
            inputStr = scanner.nextLine();

            if (!inputStr.equalsIgnoreCase("exit")) {

                int numOfUpperCases = countUppcaseChar(inputStr); /* this variables hold the count of
                uppercase letters after a method has been executed on the input string value.*/
                System.out.println("The number of uppercase letters in the given text: " + numOfUpperCases);
            }

        } while (!inputStr.equalsIgnoreCase("exit"));
        scanner.close();
        System.out.println("Goodbye!");
    }

    public static int countUppcaseChar(String text) { // method counts instances of uppercase letters.
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char letters = text.charAt(i);

            if (Character.isUpperCase(letters)) {
                count++; // if the current element is an uppercase character, the counter increases.
            }
        }
        return count;
    }
}
