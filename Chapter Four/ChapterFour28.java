package book.ChapterFour;

import java.util.Scanner;

public class ChapterFour28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(num + "! = " + factorial);
    }

}
