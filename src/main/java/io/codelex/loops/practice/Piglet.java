package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {

    // defined for the class, so every method can access and change this.
    public static int score = 0;
    public static Random random = new Random(); /* defined here, so dice() can access this, but a new obj. isn't created
    everytime dice() is invoked.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to piglet!");
        do {
            int rolled = dice();
            if (rolled == 1) { // firstly, checking if the rolled value is 1.
                System.out.println("You rolled a 1!");
                break;
            } else { // if the rolled value is 2 to 6.
                System.out.println("You rolled a " + rolled + "!");
                System.out.println("Roll again? y/n");
                answer = in.next();
            }
        } while (answer.equalsIgnoreCase("y"));
        System.out.println("You got " + score + " points.");

    }


    public static int dice() { // method "rolls" dice and uses switch statements to decide on action.

        int roll = random.nextInt(6) + 1;

        switch (roll) {
            case 2, 3, 4, 5, 6 -> score += roll;
            case (1) -> score = 0;
            default -> throw new IllegalArgumentException();
        }
        return roll;
    }
}
