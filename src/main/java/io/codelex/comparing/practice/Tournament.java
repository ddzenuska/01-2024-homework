package io.codelex.comparing.practice;

import io.codelex.NoCodeWrittenException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tournament {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/comparing/tournament.txt";

    public static void main(String[] args) throws URISyntaxException, IOException {
        final Path path = Paths.get(Tournament.class.getResource(file).toURI());
        final List<String> source = Files.readAllLines(path, charset);

        throw new NoCodeWrittenException();
    }
}
