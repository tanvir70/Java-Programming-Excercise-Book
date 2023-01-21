package book.JavaDateandTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormateString {
    public static void main(String[] args) {
        // Create a LocalDate object for 2022-12-26
        LocalDate date = LocalDate.of(2022, 12, 26);


        // Format the LocalDate object as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String str = date.format(formatter);


        // Print the formatted string
        System.out.println(str); // Output: 2022/12/26
    }

}
