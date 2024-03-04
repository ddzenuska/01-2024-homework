package io.codelex.typesandvariables.practice;

import java.util.Scanner;
public class UpperCaseCount {

    public static int countUppcaseChar(String text) { /* method which counts the instances of uppercase letters
    by iterating with a for loop through the provided string.*/
        int count = 0; // declared and initialized a counter variable which holds the number of uppercase letter instances
        for (int i = 0; i < text.length(); i++) {
            char letters = text.charAt(i);

            if (Character.isUpperCase(letters)) {
                count++; /* if the current element or letter (character) in the text is an
                uppercase character, the counter appends by one.*/
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // initialized scanner obj.
        String inputStr; // declared a string variable which will hold the users input.
        System.out.println("Hello! This program counts the amount of uppercase letters in a provided text. If you" +
                "\nwould like to quit this program, please type the word exit."); // the program introduces itself.

        do { // executes the written logic, while the input does not equal the word "exit".
                System.out.print("Provide your text: ");
                inputStr = scanner.nextLine();

                if (!inputStr.equalsIgnoreCase("exit")) { /* if the input equals "exit", the text "Goodbye"
                is written and the program quits immediately. Without this extra if statement, after encountering the
                while statement, the program counts the number of uppercase letters in the word "exit" and
                only then quits and writes the message "Goodbye".*/

                int numOfUpperCases = countUppcaseChar(inputStr); /* this variables hold the count of
                uppercase letters after a method has been executed on the input string value.*/

                System.out.println("The number of uppercase letters in the given text: " + numOfUpperCases);
            }

        } while (!inputStr.equalsIgnoreCase("exit")); /* repeat program until the input value
        matches the word "exit".*/
        scanner.close();
        System.out.println("Goodbye!"); // prints "Goodbye" when the program quits - scanner closes.
    }
}
