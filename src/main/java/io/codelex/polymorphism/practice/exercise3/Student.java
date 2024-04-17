package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student GPA: " + gpa + '.');
    }
}
