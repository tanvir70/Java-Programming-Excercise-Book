package book.JavaDateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now : " + now);

        var currentDate = LocalDate.now();
        System.out.println("Current date = " + currentDate);

        var currentTime = LocalTime.now();
        System.out.println("Current Time : " + currentTime);
    }
}
