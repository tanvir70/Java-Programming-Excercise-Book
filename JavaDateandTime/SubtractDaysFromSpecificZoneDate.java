package book.JavaDateandTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class SubtractDaysFromSpecificZoneDate {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("America/Toronto");
        LocalDate date = LocalDate.now(zoneId);

        Scanner scan = new Scanner(System.in);
        var dayToSubtract = scan.nextInt();

        LocalDate newDate = date.minusDays(dayToSubtract);

        System.out.println(newDate);
    }
}
