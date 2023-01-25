package book;

import java.util.Scanner;

public class ChapterThree13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a character: ");

            char ch = scan.next().charAt(0);

            if ((ch >= 'A' && ch <= 'Z') || ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " is a letter");
            } else if (ch <= '9') {
                System.out.println(ch + " is a digit");
            } else {
                System.out.println(ch + " is a special character");
            }
        }
    }
}