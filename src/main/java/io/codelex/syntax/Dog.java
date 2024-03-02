package io.codelex.syntax;

/**
 * Basic class syntax example
 */
public class Dog {
    private static final String DOG_EMOJI = "\uD83D\uDC15";

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double calculateAgeInDogYears(int coefficient) {
        return (double) age / coefficient;
    }

    public void introduce() {
        System.out.println("Hello! This is dog, my name is "
                + name + " and I am " + age + " years old " + DOG_EMOJI);
    }

    public static void main(String[] args) {
        int coefficient = 7;
        Dog bob = new Dog("Bob", 5);
        bob.introduce();
        double ageInDogYears = bob.calculateAgeInDogYears(coefficient);
        System.out.println("Bob's age in dog years is " + ageInDogYears);
    }
}
