package book.JavaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filePath = input.nextLine();

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            var allLines = Files.readAllLines(Path.of(filePath));
            for (String line : allLines) {
                characters += line.length();
                String[] parts = line.split("\\s+");
                words += parts.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }

}
