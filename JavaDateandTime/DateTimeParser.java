package book.JavaDateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParser {
    public static void main(String[] args) {
        // String to be parsed
        String str = "2022-12-26 15:44:22";


        // Parse the string into a LocalDateTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);


        // Print the LocalDateTime object
        System.out.println(dateTime); // Output: 2022-12-26T15:44:22
    }

}
