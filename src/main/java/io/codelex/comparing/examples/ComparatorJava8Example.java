package io.codelex.comparing.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static io.codelex.comparing.examples.Developer.prettyString;

public class ComparatorJava8Example {
    public static void main(String[] args) {
        final List<Developer> developers = new ArrayList<>(Developer.developers);
        System.out.println("Developers: \n" + prettyString(developers));

        developers.sort(Comparator.comparing(Developer::getName));
        System.out.println("\nDevelopers (Sorted by Name): \n" + prettyString(developers));

        developers.sort(Comparator.comparing(Developer::getSalary));
        System.out.println("\nDevelopers (Sorted by Salary): \n" + prettyString(developers));

        developers.sort(Comparator.comparing(Developer::getFirstLineOfCodeWritten)
                .thenComparing(Developer::getSalary)
                .thenComparing(Developer::getSkillsCount));
        System.out.println("\nDevelopers (Sorted by FirstLineOfCodeWritten, Salary, SkillCount): \n"
                + prettyString(developers));
    }
}
