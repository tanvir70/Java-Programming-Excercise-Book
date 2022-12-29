package book.ChapterFive;

import java.util.Arrays;
import java.util.Scanner;

public class ChapterFive18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of total numbers:");

        int n = scan.nextInt();
        int[] number = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            number[i] = scan.nextInt();
        }
        Arrays.sort(number);
        System.out.println("Max Number is: " + number[n - 1] + "\n" + "Min number is: " + number[0]);
    }
}
