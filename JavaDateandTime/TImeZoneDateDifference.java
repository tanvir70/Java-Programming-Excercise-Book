package book.JavaDateandTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class TImeZoneDateDifference {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("America/Toronto");

        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 1);

        ZonedDateTime dateTime1 = date1.atStartOfDay(zoneId);
        ZonedDateTime dateTime2 = date2.atStartOfDay(zoneId);

        var days = DAYS.between(dateTime1,dateTime2);

        System.out.println(days);

    }
}
