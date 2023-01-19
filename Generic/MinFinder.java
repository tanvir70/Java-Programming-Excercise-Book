package book.Generic;

public class MinFinder {
    public static < T extends Comparable<T>> T min(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }


        T min = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i].compareTo(min) < 0) {
                    min = array[i];

            }
        }
        return min;
    }


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5,-100};
        int min = min(array);
        System.out.println("min = " + min);
    }

}
