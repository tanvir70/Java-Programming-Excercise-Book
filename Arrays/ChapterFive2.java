package book.ChapterFive;

import java.util.Arrays;

public class ChapterFive2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
