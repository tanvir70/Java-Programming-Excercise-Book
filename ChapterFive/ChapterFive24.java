package book.ChapterFive;

public class ChapterFive24 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("Original array:");
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int j1 = 0; j1 < array[i1].length; j1++) {
                System.out.print(array[i1][j1] + " ");
            }
            System.out.println();
        }

        int rows = array.length;
        int cols = array[0].length;
        int[][] transposedArray = new int[cols][rows];

        for (int i1 = 0; i1 < rows; i1++) {
            for (int j1 = 0; j1 < cols; j1++) {
                transposedArray[j1][i1] = array[i1][j1];
            }
        }


        System.out.println("\nTransposed array:");
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


