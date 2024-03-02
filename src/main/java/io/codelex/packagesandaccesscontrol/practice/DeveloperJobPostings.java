package io.codelex.packagesandaccesscontrol.practice;

import io.codelex.packagesandaccesscontrol.practice.developers.Developer;
import io.codelex.packagesandaccesscontrol.practice.developers.SalaryCalculator;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class DeveloperJobPostings {
    public static void main(String[] args) {
        Developer john = new Developer("John", 8, languages("PHP"));
        Developer alice = new Developer("Alice", 1, languages("JAVA", "GO"));
        Developer bob = new Developer("Bob", 2, languages("JAVASCRIPT", ".NET"));

        asList(john, alice, bob)
                .forEach(developer -> {
                    // todo - someone is changing personal information of applicants, how to forbid that?
                    developer.name = RandomStringUtils.randomAlphabetic(12);
                    developer.yearsOfExperience = 99;
                    developer.languages = languages("PHP", "JAVA", "GO", "JAVASCRIPT", ".NET");
                    System.out.println(developer.name + " could make " + developer.calculateSalary());
                });

        // todo - someone got access to salary calculator o_0, do you want to have that information public?

        SalaryCalculator salaryCalculator = new SalaryCalculator();

        asList("PHP", "JAVA", "GO", "JAVASCRIPT", ".NET")
                .forEach(lang -> {
                    int coefficient = salaryCalculator.languageCoefficient(lang);
                    System.out.println("Now I know how to apply for this position! Language "
                            + lang + " is having " + coefficient + " coefficient");
                });
    }

    private static Set<String> languages(String... languages) {
        return new HashSet<>(asList(languages));
    }
}
