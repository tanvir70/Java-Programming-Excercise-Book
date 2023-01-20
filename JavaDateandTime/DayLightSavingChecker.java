package book.JavaDateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DayLightSavingChecker {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Toronto");
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);

        boolean isDST = zoneId.getRules().isDaylightSavings(dateTime.toInstant());

        System.out.println(isDST);

    }
}
