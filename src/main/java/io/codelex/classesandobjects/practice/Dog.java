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