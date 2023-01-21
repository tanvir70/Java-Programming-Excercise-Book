package book.ChapterFive;

import java.util.Arrays;
import java.util.Scanner;

public class ChapterFive12 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 6, 3, 9, 8, 7, 1, 10};
        System.out.println("Before : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After : " + Arrays.toString(array));

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a target value: ");
        int target = scan.nextInt();
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (array[mid] == target) {
                System.out.println("The target value is found at index " + array[mid - 1]);
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Target not found.");
    }
}
