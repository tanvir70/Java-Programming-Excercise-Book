package book.JavaDateandTime;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterOfDAteTimeOffset {
    public static void main(String[] args) {

        OffsetDateTime dateTime = OffsetDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZZ");

        System.out.println(dateTime.format(formatter));
    }

}
