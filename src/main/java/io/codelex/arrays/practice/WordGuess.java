package io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.Random;

public class WordGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String[] words = {"train", "helicopter", "wood", "computer", "vasectomy", "traveling", "glasses"};

        int randIndex = rand.nextInt(words.length); // random word index for randWords array.
        String randWord = words[randIndex]; // variable with a random word.

        char[] hiddenWord = new char[randWord.length()], missed = new char[3];
        String userGuess;
        int tries = 0;
        boolean guessedRight, solved = false;

        for (int i = 0; i < randWord.length(); i++) { // prints "_" by length of the random word.
            hiddenWord[i] = '_';
        }

        while (tries < 3 && !solved) {
            // "graphics" and logic for the start of the game.
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
            System.out.print("Word: ");
            outputWord(hiddenWord);
            System.out.println("\nMisses: " + new String(missed));

            System.out.print("\nGuess: ");
            userGuess = input.next();
            guessedRight = false;

            // iterating through characters and understanding if they match with the input character.
            for (int i = 0; i < randWord.length(); i++) {
                if (randWord.charAt(i) == userGuess.charAt(0)) {
                    hiddenWord[i] = userGuess.charAt(0);
                    guessedRight = true;
                }
            }
            if (!guessedRight) {
                missed[tries] = userGuess.charAt(0);
                tries++;
            }
            if (String.valueOf(hiddenWord).equals(randWord)) {
                solved = true;
            }
        }


        // logic for end of the game.
        if (solved) {
            System.out.println("\nYOU GOT IT!");
        } else {
            System.out.println("\nOut of tries. Game is over! The word was: " + randWord);
        }

        // logic for asking if the player wants to play again or quit.
        System.out.println("\nPlay \"again\" or \"quit\"?");
        String userChoice = input.next().toLowerCase();

        if (userChoice.equals("again")) {
            main(args);
        }
    }

    public static void outputWord(char[] word) { // prints words hidden letters when is guessed right and "_" when isn't.
        for (char c : word) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
