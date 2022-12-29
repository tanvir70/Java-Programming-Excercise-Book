package book.ChapterFive;

import java.util.Arrays;

public class ChapterFive11 {
    public static void main(String[] args) {
        String[] numbers = {"a","c","d","e","b"};

        boolean bubbleSort = true;
        while (bubbleSort == true) {
            bubbleSort = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].compareTo(numbers[i+1]) > 0){
                    String temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    bubbleSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}