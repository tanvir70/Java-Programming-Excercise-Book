package book.JavaDateandTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class SubtractDaysFromSpecificZoneDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        var dayToSubtract = scan.nextInt();

        ZoneId zoneId = ZoneId.of("America/Toronto");
        var zoneDateTime = date.atStartOfDay(zoneId);
        ZonedDateTime newDate = zoneDateTime.minusDays(dayToSubtract);
        System.out.println(newDate);
    }
}
