package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 03, 2024);
        // displaying the date
        date.displayDate();
        // getters
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        // setters
        date.setDay(19);
        date.setMonth(04);
        date.setYear(2025);

        date.displayDate();
    }
}
