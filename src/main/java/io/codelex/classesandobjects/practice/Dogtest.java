package io.codelex.classesandobjects.practice;

public class Dogtest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        // adding parents
        max = new Dog("Max", "male", lady, rocky);
        rocky = new Dog("Rocky", "male", molly, buster);
        buster = new Dog("Buster", "male", molly, sam);
        coco = new Dog("Coco", "female", lady, sparky);

        System.out.println(max);
        System.out.println(sparky);
        System.out.println(coco);

        // finding father name and if dogs have the same mother.
        System.out.println(max.fathersName());
        System.out.println(max.hasSameMotherAs(rocky));
    }
}