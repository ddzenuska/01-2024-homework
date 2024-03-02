package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;
public class SadFor {
    public static void main(String[] args) {
        System.out.println(testOne());
    }

    public static int testOne() {
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5)
                return i;
        }
        throw new NoCodeWrittenException();
    }
}
