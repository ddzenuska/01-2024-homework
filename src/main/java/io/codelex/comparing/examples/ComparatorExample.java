package io.codelex.comparing.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static io.codelex.comparing.examples.Developer.prettyString;

@SuppressWarnings("Convert2Lambda")
public class ComparatorExample {
    public static void main(String[] args) {
        final List<Developer> developers = new ArrayList<>(Developer.developers);
        System.out.println("Developers: \n" + prettyString(developers));

        Comparator<Developer> nameComparator = new Comparator<Developer>() {
            @Override
            public int compare(Developer dev1, Developer dev2) {
                return dev1.getName().compareTo(dev2.getName());
            }
        };
        developers.sort(nameComparator);
        System.out.println("\nDevelopers (Sorted by Name): \n" + prettyString(developers));

        Comparator<Developer> salaryComparator = new Comparator<Developer>() {
            @Override
            public int compare(Developer dev1, Developer dev2) {
                if (dev1.getSalary() < dev2.getSalary()) {
                    return -1;
                } else if (dev1.getSalary() > dev2.getSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        developers.sort(salaryComparator);
        System.out.println("\nDevelopers (Sorted by Salary): \n" + prettyString(developers));

        Comparator<Developer> firstLineOfCodeWrittenComparator = new Comparator<Developer>() {
            @Override
            public int compare(Developer dev1, Developer dev2) {
                return dev1.getFirstLineOfCodeWritten().compareTo(dev2.getFirstLineOfCodeWritten());
            }
        };
        developers.sort(firstLineOfCodeWrittenComparator);
        System.out.println("\nDevelopers (Sorted by FirstLineOfCodeWritten): \n" + prettyString(developers));
    }
}
