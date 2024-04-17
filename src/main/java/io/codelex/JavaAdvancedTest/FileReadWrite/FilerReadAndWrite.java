package io.codelex.JavaAdvancedTest.FileReadWrite;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilerReadAndWrite {
    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path originalFilePath = Paths.get("src/main/resources/collections/lear.txt");
        List<String> lines = Files.readAllLines(originalFilePath);

        String reversedFileContent = lines.stream()
                .map(line -> new StringBuilder(line).reverse().toString())
                .collect(Collectors.joining("\n"));

        String reversedFileTitle = new StringBuilder(originalFilePath.getFileName().toString()).reverse().toString();

        Path fileParentDirectory = originalFilePath.getParent();
        Path newFilePath = fileParentDirectory.resolve(reversedFileTitle);
        byte[] reversedFileContentBytes = reversedFileContent.getBytes();

        Files.write(newFilePath, reversedFileContentBytes);
    }
}
