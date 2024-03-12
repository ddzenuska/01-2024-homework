package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class NameAndBirthInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        int userBirthYear = scanner.nextInt();

        introduce(userName, userBirthYear); // creating a new instance


        scanner.close();
    }

    public static void introduce(String name, int yearOfBirth) { // method that outputs the name and year of birth of the created person
        System.out.println("My name is " + name + " and I was born in " + yearOfBirth + ".");

    }


}
