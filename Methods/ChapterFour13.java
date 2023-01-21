package book;

import java.util.Scanner;

public class ChapterFour13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i;

        System.out.println("Enter a number: ");
        num = input.nextInt();

        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
    }

}
