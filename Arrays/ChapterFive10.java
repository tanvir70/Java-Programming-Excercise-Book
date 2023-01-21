package book.ChapterFive;

import java.util.Scanner;

public class ChapterFive10 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 6, 3, 9, 8, 7, 1, 10};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a target value: ");
        int target = scan.nextInt();
        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target is found at " + i + "th index");
                break;
            }
        }
        if ( i >= numbers.length){
            System.out.println("Array dose not contain the target value.");
        }
    }
}
