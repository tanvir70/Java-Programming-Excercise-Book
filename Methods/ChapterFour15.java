package book;

public class ChapterFour15 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            count++;
            if (count == 10) {
                System.out.println("Printing a line after 10th digit.");
                count = 0;
            }
        }
    }
}