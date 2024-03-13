package io.codelex.classesandobjects.practice;

public class Dog {
    private String name;
    private String sex;
    private Dog father;
    private Dog mother;

    public Dog(String name, String sex) { // constructor for dogs without parents.
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, Dog mother, Dog father) { // constructor with parents.
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father != null) {
            return father.name();
        }
        return "Unknown";
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return mother.name().equals(otherDog.mother.name);
    }

    public String name() { // method for returning a string of parent name.
        return name;
    }

    public String toString() {
        return "Dog " + this.name + " => Sex: " + this.sex +
                ", mother: " + (this.mother != null ? this.mother.name() : "Unknown") +
                ", father: " + (this.father != null ? this.father.name() : "Unknown") + ".";
    }
}

class Dogtest {
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