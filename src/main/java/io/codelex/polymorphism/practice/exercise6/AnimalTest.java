package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>(); // stores input animals and their food

        while (true) {
            String animalInput = scanner.nextLine(); // user input animal info
            if (animalInput.equals("End")) {
                break;
            }
            String[] animalData = animalInput.split(" ");
            Animal animal = null;
            if (animalData[0].equals("Mouse")) { // after animal input info is split, corresponding obj. is created with index gained info
                animal = new Mouse(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]);
            } else if (animalData[0].equals("Zebra")) {
                animal = new Zebra(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]);
            } else if (animalData[0].equals("Cat")) {
                animal = new Cat(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3], animalData[4]);
            } else if (animalData[0].equals("Tiger")) {
                animal = new Tiger(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]);
            }

            // if the input was a food, in this case, not an animal, this iterates and adds the input food to the animal
            if (animal != null) {
                animal.makeSound();
                String foodInfo = scanner.nextLine();
                if (foodInfo.equals("End") || foodInfo.isEmpty()) {
                    break;
                }
                String[] foodData = foodInfo.split(" ");
                Food food = null;
                if (foodData[0].equals("Vegetable")) {
                    food = new Vegetable(Integer.parseInt(foodData[1]));
                } else if (foodData[0].equals("Meat")) {
                    food = new Meat(Integer.parseInt(foodData[1]));
                }
                if (food != null) {
                    animal.eat(food);
                }
                animals.add(animal); // adds the created animal and its fed food to the list, after all of this
                System.out.println(animal);
            }
        }

        for (Animal animal : animals) { // prints each input animal from the list after "End"
            System.out.print(animal);
        }
    }
}