package book.JavaDateandTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonalTime {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(time);
    }
}
