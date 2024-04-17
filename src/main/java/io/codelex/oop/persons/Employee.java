package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate curr = LocalDate.now();
        int years = curr.getYear() - startedWorking.getYear();
        if (curr.getMonthValue() < startedWorking.getMonthValue() ||
                (curr.getMonthValue() == startedWorking.getMonthValue() && curr.getDayOfMonth() < startedWorking.getDayOfMonth()))
            years--;
        return years;
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + ")";
    }
}
