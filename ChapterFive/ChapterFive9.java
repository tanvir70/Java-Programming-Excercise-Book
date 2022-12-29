package book.ChapterFive;

public class ChapterFive9 {
    public static void main(String[] args) {
        // Declare an array of strings with 7 elements
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Print the array in reverse order
        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println(days[i]);
        }

    }
}
