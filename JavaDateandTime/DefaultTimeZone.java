package book.JavaDateandTime;

import java.util.TimeZone;

public class DefaultTimeZone {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));

        System.out.println(TimeZone.getDefault());
    }
}
