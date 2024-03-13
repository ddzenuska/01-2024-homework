package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;

public class RollTwoDice {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int rand1, rand2, randSum = 0;

        System.out.print("Desired sum: ");
        int input = in.nextInt();
        do {
            rand1 = rand.nextInt(6) + 1;
            rand2 = rand.nextInt(6) + 1;
            randSum = rand1 + rand2;
            System.out.println(rand1 + " and " + rand2 + " = " + randSum);
        } while (input != randSum);
    }
}
