package io.codelex.JavaAdvancedTest.GenericsPartOf;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConditionalCounterTest {

    @Test
    public void ShouldReturnPercentageOfNamesLongerThanFour() {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        assertThat(names.partOf(), is(equalTo(2017)));
    }
}
