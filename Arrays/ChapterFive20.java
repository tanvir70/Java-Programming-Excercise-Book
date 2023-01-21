package book.ChapterFive;

import java.util.Scanner;
public class ChapterFive20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {1, 21, 3, 14, 5, 60, 7, 6};
        System.out.print("Enter a target value : ");
        int n = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if ( (array[i] + array[j]) == n){
                    System.out.print("Result" + array[i] +","+ array[j]);
                }
            }
        }
    }
}
