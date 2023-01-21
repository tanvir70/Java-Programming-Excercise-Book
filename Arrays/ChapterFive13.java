package book.ChapterFive;

import java.util.Arrays;
import java.util.Scanner;

public class ChapterFive13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // Print the array
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

