package book.JavaDateandTime;

import java.util.TimeZone;

public class TimeZoneDisplayName {
    public static void main(String[] args) {
        TimeZone zone = TimeZone.getDefault();
        System.out.println(zone.getDisplayName());
    }
}
