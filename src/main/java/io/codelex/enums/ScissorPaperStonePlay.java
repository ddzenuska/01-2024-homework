package io.codelex.enums;

import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStonePlay {
    private static int pcWon = 0; // for counting and printing winning stats.
    private static int userWon = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Let us begin...");
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.print("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String input = in.nextLine();
            if (input.equals("q")) { // if user decides to quit the game.
                System.out.println("\nNumber of trials: " + (pcWon + userWon));
                // used regex to display "%", calculate and print two decimal digits.
                System.out.printf("I won %d(%.2f%%). You won %d(%.2f%%).\n",
                        pcWon, (double) pcWon / (pcWon + userWon) * 100, userWon,
                        (double) userWon / (pcWon + userWon) * 100);
                System.out.println("Bye!");
                break;
            } else { // if input is valid, "gameLogic" is called with appropriate arguments.
                gameLogic(input, rand.nextInt(3));
            }
        }
    }

    private static void gameLogic(String userChoice, int pcChoice) {
        ScissorPaperStone userMove;
        ScissorPaperStone pcMove = ScissorPaperStone.values()[pcChoice];

        switch (userChoice) { // user input of X is the same as enum X name, for easier comparison.
            case "s":
                userMove = ScissorPaperStone.SCISSOR;
                break;
            case "p":
                userMove = ScissorPaperStone.PAPER;
                break;
            case "t":
                userMove = ScissorPaperStone.STONE;
                break;
            default:
                System.out.println("\n\tInvalid input, try again...");
                return;
        }

        System.out.println("\tMy turn: " + pcMove.getMove());

        if (userMove == pcMove) { // if statements for finding and printing the winner, as well as counting points.
            System.out.println("\tTie!\n");
        } else if (userMove == ScissorPaperStone.SCISSOR && pcMove == ScissorPaperStone.PAPER) {
            System.out.println("\tYou won!\n");
            userWon++;
        } else if (userMove == ScissorPaperStone.SCISSOR && pcMove == ScissorPaperStone.STONE) {
            System.out.println("\tStone breaks scissor, I won!\n");
            pcWon++;
        } else if (userMove == ScissorPaperStone.PAPER && pcMove == ScissorPaperStone.SCISSOR) {
            System.out.println("\tScissor cuts paper, I won!\n");
            pcWon++;
        } else if (userMove == ScissorPaperStone.PAPER && pcMove == ScissorPaperStone.STONE) {
            System.out.println("\tYou won!\n");
            userWon++;
        } else if (userMove == ScissorPaperStone.STONE && pcMove == ScissorPaperStone.PAPER) {
            System.out.println("\tYour rock is nothing against my paper!\n");
            pcWon++;
        } else if (userMove == ScissorPaperStone.STONE && pcMove == ScissorPaperStone.SCISSOR) {
            System.out.println("\tYou won!\n");
            userWon++;
        }
    }
}
