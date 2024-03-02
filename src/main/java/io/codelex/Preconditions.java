package io.codelex;

public class Preconditions {
    public static void assertThat(boolean assertion) {
        if (assertion) {
            System.out.println("...");
            return;
        }
        throw new IllegalStateException("Looks like exercise is not solved yet!");
    }
}
