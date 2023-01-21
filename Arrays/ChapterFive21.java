package book.ChapterFive;

import java.util.Arrays;
public class ChapterFive21 {
    public boolean isEqual(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        if (n != m) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < m; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ChapterFive21 ob = new ChapterFive21();

        int[] arr1 = {3, 5, 2, 5, 2};
        int[] arr2 = {2, 3, 5, 5, 2};
        // Function call
        if (ob.isEqual(arr1, arr2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }

}

