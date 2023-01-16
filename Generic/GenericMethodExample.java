package book.Generic;

public class GenericMethodExample {
    public static <T> int count(T[] array, T value){
        int count = 0;
        for (T element: array) {
            if ( element.equals(value)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 2, 4, 2, 3};
        var count = count(nums, 2);
        System.out.println("Count = " + count);
    }
}
