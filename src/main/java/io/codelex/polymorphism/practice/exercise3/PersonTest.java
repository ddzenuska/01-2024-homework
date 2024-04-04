package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student(4.2);
        student.setFirstName("Alice");
        student.setLastName("Bleak");
        student.setAddress("Long St. 24");
        student.setId(44);

        student.display();


        Employee employee = new Employee("Programmer");
        employee.setFirstName("Davis");
        employee.setLastName("Kirkelis");
        employee.setAddress("Liela iela 32");
        employee.setId(2378);

        employee.display();


        Person justJohn = new Person("John", "Yarik", "Some Street 4", 19981014);
        justJohn.display();
    }
}
