package book.JavaDateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static void main(String[] args) {
        ZoneId torontoZoneId = ZoneId.of("America/Toronto");
        ZoneId losAngelesZoneId = ZoneId.of("America/Los_Angeles");

        ZonedDateTime dateTimeToronto = ZonedDateTime.now(torontoZoneId);
        ZonedDateTime dateTimeLosAngeles = dateTimeToronto.withZoneSameInstant(losAngelesZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssz");

        System.out.println("Toronto : " + dateTimeToronto.format(formatter));
        System.out.println("Los Angeles : " + dateTimeLosAngeles.format(formatter));
    }
}
