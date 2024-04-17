package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        Map<Integer, Integer> histogram = generateHistogram(scores); //Map to implement key value pairs
        displayHistogram(histogram);
    }

    /* Method creates a histogram Map.
     *
     * Line of scores is split into an array, iterated, divided and multiplied by 10, that way
     * gaining a round score by removing the last digit, then multiplying the integer division result.
     *
     * The range - rounded score result - is put in the histogram map with it's number of occurrences.
     * If the number hasn't been met, the score is set to 0, and incremented by one, otherwise if it has been met before,
     * it is found, and its count is incremented, which is achieved with getOrDefault() method.
     *
     * returns - a map with integer key value pairs of range and their count.
     */
    private static Map<Integer, Integer> generateHistogram(String scores) {
        Map<Integer, Integer> histogram = new HashMap<>();
        String[] scoreArray = scores.split(" ");
        for (String score : scoreArray) {
            int num = Integer.parseInt(score);
            int range = num / 10 * 10;
            histogram.put(range, histogram.getOrDefault(range, 0) + 1);
        }
        return histogram;
    }

    /*
     * Method creates a range, converts and displays the histogram Map.
     *
     * Creates a range with lower & upperBound variable results by iterating from 1-9.
     * Gains the number of asterisks by repeating them based on the count of each range, starting from lowerBound,
     * otherwise, 0 as default value.
     *
     * Prints range from lowerBound to upperBound with regex, with asterisks following.
     */
    private static void displayHistogram(Map<Integer, Integer> histogram) {
        for (int i = 0; i < histogram.size(); i++) {
            int lowerBound = i * 10;
            int upperBound = lowerBound + 9;
            String stars = "*".repeat(histogram.getOrDefault(lowerBound, 0));
            System.out.printf("%02d-%02d: %s%n", lowerBound, upperBound, stars);
        }
        // Specifically for the highest range of 100, otherwise displays "100-109:"
        int lowerBound = 100;
        String stars = "*".repeat(histogram.getOrDefault(lowerBound, 0));
        System.out.printf("%4d: %s%n", lowerBound, stars);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
