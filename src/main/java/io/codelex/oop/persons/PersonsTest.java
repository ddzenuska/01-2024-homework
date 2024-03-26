package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonsTest {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "Lee", "EID981", 28, "Programmer", LocalDate.of(2020, 02, 23));

        System.out.println(bob.getWorkExperience());
        System.out.println(bob.getInfo());


        Customer suzy = new Customer("Suzy", "Lecher", "CID892", 34, 7);

        System.out.println("Suzy has made " + suzy.getPurchaseCount() + " purchases");
        suzy.setPurchaseCount(17);

        System.out.println(suzy.getInfo());
    }
}
