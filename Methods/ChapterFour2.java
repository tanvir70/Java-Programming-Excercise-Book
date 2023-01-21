package book.ChapterFour;

import java.util.Scanner;

public class ChapterFour2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int points = 0;
        String grade = scanner.nextLine();
        switch (grade) {
            case "A" ->  points = 4;
            case "B" -> points = 3;
            case "C" -> points = 2;
            case "D" -> points = 1;
            default -> points = 0;
        }
        System.out.println(points);
    }
}
