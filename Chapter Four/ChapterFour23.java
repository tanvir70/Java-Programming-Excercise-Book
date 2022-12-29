package book;

import java.util.Scanner;

public class ChapterFour23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.print("Enter another number: ");
        int c = sc.nextInt();

        if ( a > b && b > c){
            System.out.println( a + " is the largest number from " + a + " " + b + " " + c);
            System.out.println( c + " is the smallest number form "  + a + " " + b + " " + c);
        } else if ( b > a && a > c) {
            System.out.println( b + " is the largest number from " + a + " " + b + " " + c);
            System.out.println( c + " is the smallest number form "  + a + " " + b + " " + c);
        } else if ( c > a && a > b) {
            System.out.println( c + " is the largest number from " + a + " " + b + " " + c);
            System.out.println( b + " is the smallest number form "  + a + " " + b + " " + c);
        }else if ( c > b && b > a) {
            System.out.println( c + "is the largest number from " + a + " " + b + " " + c);
            System.out.println( a + " is the smallest number form "  + a + " " + b + " " + c);
        }

    }
}
