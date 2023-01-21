package book.ChapterFive;

import java.util.Arrays;
import java.util.Collections;

public class ChapterFive6 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 8, 2, 6, 3, 9, 8, 7, 1, 10};
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(numbers));
    }

}
