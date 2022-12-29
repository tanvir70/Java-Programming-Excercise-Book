package book;

import java.util.Scanner;

public class ChapterFour19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if ( a < 100){
            System.out.println("Small");
        } else if (a >= 100 && a <= 1000) {
            System.out.println("Medium");
        }else {
            System.out.println("Large");
        }
    }
}
