package book.ChapterFive;

public class ChapterFive7 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 8, 2, 6, 3, 9, 8, 7, 1, 10};
        int target = 6;

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                found = true;
                System.out.println("Found item on index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }
}
