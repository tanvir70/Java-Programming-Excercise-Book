package book.JavaDateandTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeParser {
    public static void main(String[] args) {
        // String to be parsed
        String str = "2022-12-26 15:44:22+01:00";


        // Parse the string into an OffsetDateTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZZ");
        OffsetDateTime dateTime = OffsetDateTime.parse(str, formatter);


        // Print the OffsetDateTime object
        System.out.println(dateTime); // Output: 2022-12-26T15:44:22+01:00
    }

}
