package io.codelex.streams.practice;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        return null;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return null;
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return null;
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}
