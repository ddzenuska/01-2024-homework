package io.codelex.hashcodeequals;

import static io.codelex.Preconditions.assertThat;

public class Exercise2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "000000-0001");
        Student student2 = new Student("John", "Doe", "000000-0002");
        Student student3 = new Student("John", "Doe", "000000-0003");

        // todo - make sure that this program works after adding equality check in Student
        assertThat(student1.equals(student1));
        assertThat(student2.equals(student2));
        assertThat(student3.equals(student3));

        assertThat(!student1.equals(student2));
        assertThat(!student1.equals(student3));
        assertThat(!student2.equals(student3));
    }
}
