package book;

import java.util.Scanner;

public class ChapterThree15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total call duration: ");
        int number = scan.nextInt();
        double bill = 0;
        if ( number < 500){
            System.out.println("Total bill: 125 ");
        } else if (number > 500 && number < 1001) {
            bill =  125 + (number - 500) * .25;
            System.out.println("Total bill: " + bill);
        }else {
            bill =  125 + (number - 1000) * .49 + (500 * .25);
            System.out.println("Total bill: " + bill);
        }
    }
}
