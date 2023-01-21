package book;

import java.util.Scanner;

public class ChapterFour4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input a letter
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        //Let’s use a switch statement to determine whether the letter is a vowel or consonant
        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letter + " is a vowel.");
            default -> System.out.println(letter + " is a consonant.");
        }
    }
}
