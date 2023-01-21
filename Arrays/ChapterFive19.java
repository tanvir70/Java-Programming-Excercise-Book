package book.ChapterFive;

import java.util.Arrays;

public class ChapterFive19 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 2, 6, 3, 9, 8, 7, 1, 10};
        Arrays.sort(numbers);
        System.out.println("Sorted array : " + Arrays.toString(numbers));

        int[] num2 = new int[numbers.length];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                num2[j] = numbers[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(num2));
    }
}
