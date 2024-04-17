package io.codelex.JavaAdvancedTest.GenericsPartOf;

import java.util.List;
import java.util.function.Predicate;

public class ConditionalCounter<T> {
    public void double partOf(List<T> listToCheck, Predicate<T> condition) {
        long countOfConditionedElements = listToCheck.stream()
                .filter(condition)
                .count();
        return (double) countOfConditionedElements / listToCheck.size();
    }
}
