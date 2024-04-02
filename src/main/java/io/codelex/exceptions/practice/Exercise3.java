package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) {
        try (RandomAccessFile input = new RandomAccessFile(file, "r")) { // avoiding recourse leak and use of "finally".
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (
                IOException e) { // IOException because of using resources, which include database connection, file stream etc.
            e.printStackTrace();
        }
    }
}