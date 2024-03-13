package io.codelex.loops.practice;

public class AsciiFigure {

    public static void main(String[] args) {
        int size = 5;

        for (int figure = 0; figure < size; figure++) { // for each "figure" iteration, inner loops complete fully.
            for (int i = 0; i < (size - figure - 1) * 4; i++) { // draws slashes.
                System.out.print("/");
            }
            for (int i = 0; i < figure * 8; i++) { // draws asterisks.
                System.out.print("*");
            }
            for (int i = 0; i < (size - figure - 1) * 4; i++) { // draws backslashes.
                System.out.print("\\"); // input two because one backslash causes issue with (").
            }
            System.out.println(); // moves by a line after each outer loops iteration.
        }
    }
}
