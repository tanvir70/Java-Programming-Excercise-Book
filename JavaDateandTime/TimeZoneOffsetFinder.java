package book.JavaDateandTime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZoneOffsetFinder {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("America/Toronto");

        ZonedDateTime dateTime = ZonedDateTime.now(id);

        ZoneOffset offset = dateTime.getOffset();

        System.out.println(offset);
    }
}
