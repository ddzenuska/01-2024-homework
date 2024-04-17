package io.codelex.streams.practice;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() { //adds elements to a result container StringBuilder
        return StringBuilder::append;
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() { //merge two result containers
        return StringBuilder::append;
    }

    @Override
    public Function<StringBuilder, String> finisher() { //transforms to the final result - a string
        return StringBuilder::toString;
    }

    @Override
    public Set<Characteristics> characteristics() { //returns a set of characteristics of this Collector (UNORDERED)
        return Collections.singleton(Characteristics.UNORDERED); //singleton returns an immutable set containing only the specified object
    }
}
