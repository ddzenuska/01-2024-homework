package io.codelex.collections.practice;

import io.codelex.collections.practice.phonebook.PhoneDirectory;

public class PhoneDirectoryTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("Deivids", "27618989");
        phoneDirectory.putNumber("Kristine", "27930173");

        System.out.println(phoneDirectory.getNumber("Deivids"));
        System.out.println(phoneDirectory.getNumber("Kristine"));

        phoneDirectory.putNumber("Deivids", "999-999-9999");
        System.out.println("Updated Deivids nr: " + phoneDirectory.getNumber("Deivids"));

        System.out.println(phoneDirectory);
    }
}
