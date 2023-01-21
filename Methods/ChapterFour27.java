package book;

import java.util.Scanner;

public class ChapterFour27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer value : ");
        int n = scan.nextInt();

        int temp = 0;
        temp = n;
        int rev = 0;
        int rem;

        while( temp != 0){

            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if ( n < 0 || n != rev)
            System.out.println(n + " is not a palindrome number.");
        if ( n == rev)
            System.out.println(n + " is a palindrome number.");

    }
}
