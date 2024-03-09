package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char player = 'X';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        boolean gameInProgress = true;

        while (gameInProgress) { // continue till there is a winner or a tie.
            makeMove(keyboard);
            displayBoard();
            gameInProgress = !checkWinner() && !isBoardFull();
            changePlayer();
        }
        keyboard.close();
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void makeMove(Scanner keyboard) { // makes move and changes board variable based on input character.
        int row, column;
        do {
            System.out.print("'" + player + "', choose your location (row, column): ");
            row = keyboard.nextInt();
            column = keyboard.nextInt();
        } while (!moveValid(row, column)); // while the move is not valid, the program will re-ask for a valid input.

        board[row][column] = player;
    }

    public static boolean moveValid(int row, int column) { // checks if the input (move) is valid - within range.
        return row >= 0 && column >= 0 && row < 3 && column < 3 && board[row][column] == ' ';
    }

    private static void changePlayer() { // changes games current player to the next one.
        player = (player == 'X') ? 'O' : 'X'; // if the current player is "X", then it changes to "O" to make the move.
    }

    public static boolean checkWinner() { // checks if there is a winner based on patterns, returning true/false.
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player ||
                    board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                System.out.println(player + " is the winner!");
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            System.out.println(player + " is the winner!");
            return true;
        }

        return false;
    }

    public static boolean isBoardFull() { // determines if the board is full and the game should be a tie.
        for (int rows = 0; rows < 3; rows++) { // iterates through cells.
            for (int columns = 0; columns < 3; columns++) {
                if (board[rows][columns] == ' ') { // if the current cell is empty, means the board is not full.
                    return false;
                }
            }
        }
        System.out.println("The game is a tie!"); // if every cell is full
        return true;
    }
}