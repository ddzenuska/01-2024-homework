package io.codelex.typesandvariables.practice;

import java.util.Scanner;
public class NameAndBirthInfo {

        String name;
        int yearOfBirth;

        public NameAndBirthInfo(String myName, int myBirthYear) { // constructor method for creating a new object - person
            name = myName;
            yearOfBirth = myBirthYear;
        }

        public void introduce() { // method that outputs the name and year of birth of the created person
            System.out.println("My name is " + name + " and I was born in " + yearOfBirth + ".");

        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            System.out.print("Enter your year of birth: ");
            int userBirthYear = scanner.nextInt();

            NameAndBirthInfo person = new NameAndBirthInfo(userName, userBirthYear); // creating a new instance

            person.introduce(); // calling the introduce method to print the objects values in the terminal


            scanner.close();
        }

}
