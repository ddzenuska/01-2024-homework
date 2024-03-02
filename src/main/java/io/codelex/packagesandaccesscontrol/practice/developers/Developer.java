package io.codelex.packagesandaccesscontrol.practice.developers;

import java.math.BigDecimal;
import java.util.Set;

public class Developer {
    public static final SalaryCalculator SALARY_CALCULATOR = new SalaryCalculator();

    public String name;
    public int yearsOfExperience;
    public Set<String> languages;

    public Developer(String name, int yearsOfExperience, Set<String> languages) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.languages = languages;
    }

    public BigDecimal calculateSalary() {
        return SALARY_CALCULATOR.calculateSalary(yearsOfExperience, languages);
    }
}
