package book.JavaDateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneIdFinder {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("America/Toronto");

        ZonedDateTime dateTime = ZonedDateTime.now(id);

        String id2 = dateTime.getZone().getId();

        System.out.println(id);
    }
}
