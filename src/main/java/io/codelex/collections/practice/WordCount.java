package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        List<String> txt = Files.readAllLines(path, charset); // converted the text to a list for iteration

        int lines = txt.size();
        int words = 0;
        int chars = 0;

        for (String line : txt) { // iterating through each the line
            chars += line.length(); // the length of the line of words including whitespaces
            String[] word = line.trim().split("\\s+"); // creating an array of words in the line, splitting by whitespaces
            words += word.length;
        }

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }
}
