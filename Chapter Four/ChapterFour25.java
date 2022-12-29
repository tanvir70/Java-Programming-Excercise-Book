package book;

import java.util.Scanner;

public class ChapterFour25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("You can vote, join the queue");
        }else {
            System.out.println("Sorry, you are not eligible for voting this year. \n");
        }
    }
}