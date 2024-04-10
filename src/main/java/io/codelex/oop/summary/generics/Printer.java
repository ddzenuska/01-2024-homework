package io.codelex.oop.summary.generics;

/*
 * Converted to a record class for a simplicity.
 * A record class has constraints, but this class has to create immutable data and
 * have a print method, aside from the constructor, so this looks simpler.
 * Should I use this or convert to a regular class? */

public record Printer<T>(T thingToPrint) {

    public void print() {
        System.out.println(thingToPrint);
    }
}
