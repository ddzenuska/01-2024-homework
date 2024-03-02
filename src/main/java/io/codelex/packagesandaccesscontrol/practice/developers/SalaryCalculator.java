package io.codelex.packagesandaccesscontrol.practice.developers;

import java.math.BigDecimal;
import java.util.Set;

import static java.math.BigDecimal.ZERO;

public class SalaryCalculator {
    public static BigDecimal BASE_SALARY = new BigDecimal("700");
    public static BigDecimal BASE_LANGUAGE_BONUS = new BigDecimal("400");

    public BigDecimal calculateSalary(int yearsOfExperiance,
                                      Set<String> knowsLanguages) {
        final BigDecimal bonuses = knowsLanguages.stream()
                .map(lang -> {
                    BigDecimal bonus = new BigDecimal(languageCoefficient(lang));
                    return BASE_LANGUAGE_BONUS.multiply(bonus);
                })
                .reduce(ZERO, BigDecimal::add);
        return BASE_SALARY.add(bonuses);
    }

    public int languageCoefficient(String language) {
        switch (language) {
            case "JAVA":
            case ".NET":
                return 3;
            case "PHP":
                return 0;
            case "JAVASCRIPT":
                return 2;
            case "GO":
                return 2;
            default:
                return 0;
        }
    }
}
