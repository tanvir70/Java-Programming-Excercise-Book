package book.JavaDateandTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TImeZoneWeeksDayName {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        LocalDate date = LocalDate.of(2220, 2, 1);

        ZonedDateTime zonedDateTime = date.atStartOfDay(zoneId);
        String name = zonedDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRENCH);

        System.out.println(name);
    }
}

