package io.codelex.comparing.examples;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

class Developer implements Comparable<Developer> {
    private String name;
    private int salary;
    private int skillsCount;
    private LocalDate firstLineOfCodeWritten;

    static final List<Developer> developers = Stream.of(
            new Developer("Bob", 1000, 1, LocalDate.of(2019, 1, 1)),
            new Developer("David", 2500, 3, LocalDate.of(2016, 10, 5)),
            new Developer("Chris", 1300, 2, LocalDate.of(2018, 6, 4)),
            new Developer("Steve", 5000, 8, LocalDate.of(2009, 9, 30))
    ).collect(Collectors.toList());

    Developer(String name, int salary, int skillsCount, LocalDate firstLineOfCodeWritten) {
        this.name = name;
        this.salary = salary;
        this.skillsCount = skillsCount;
        this.firstLineOfCodeWritten = firstLineOfCodeWritten;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getSkillsCount() {
        return skillsCount;
    }

    public LocalDate getFirstLineOfCodeWritten() {
        return firstLineOfCodeWritten;
    }

    @Override
    public int compareTo(Developer other) {
        if (skillsCount < other.skillsCount) {
            return -1;
        } else if (skillsCount > other.skillsCount) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Developer{" + "name='" + name + '\'' +
                ", salary=" + salary +
                ", skillsCount=" + skillsCount +
                ", firstLineOfCodeWritten=" + firstLineOfCodeWritten +
                '}';
    }

    static String prettyString(List<Developer> developers) {
        return developers.stream().map(Developer::toString).collect(joining("\n"));
    }
}
