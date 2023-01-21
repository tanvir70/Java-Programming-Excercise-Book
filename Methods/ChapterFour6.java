package book;

import java.util.Scanner;

public class ChapterFour6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 5: ");

        String roman = "";
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> roman = "I";
            case 2 -> roman = "II";
            case 3 -> roman = "III";
            case 4 -> roman = "IV";
            case 5 -> roman = "V";
            default -> System.out.println("Invalid number. Please enter a number between 1 and 5.");
        }
        System.out.println(number + "'s roman representation is: " + "'" +
                roman + "' ");
    }
}