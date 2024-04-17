package io.codelex.JavaAdvancedTest.Joiner;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {

    @Test
    public void ShouldReturnDashesConnectingNumbers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        String result = joiner.join(numbers);
        assertEquals("1-2-3-4-5", result);
    }

    @Test
    public void ShouldReturnAsterisksConnectingNumbers() {
        Joiner<Integer> joiner = new Joiner<>("*");
        List<Integer> numbers = List.of(9, 10, 4, 6, 0, -1);
        String result = joiner.join(numbers);
        assertEquals("9*10*4*6*0*-1", result);
    }
}
