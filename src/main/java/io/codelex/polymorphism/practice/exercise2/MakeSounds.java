package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> things = new ArrayList<>();
        things.add(new Firework());
        things.add(new Parrot());
        things.add(new Radio());

        things.forEach(Sound::playSound); // used method reference for a shorter code, instead of a for loop / lambda
    }
}
