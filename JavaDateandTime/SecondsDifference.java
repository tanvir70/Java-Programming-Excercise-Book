package book.JavaDateandTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.*;

public class SecondsDifference {
    public static void main(String[] args) {


        LocalDateTime date1 = LocalDateTime.of(2020, 1, 1,0,0,0);
        LocalDateTime date2 = LocalDateTime.of(2020, 1, 2,0,0,0);
        //var seconds = SECONDS.between(date1,date2);
        //System.out.println(seconds);

        Duration du = Duration.between(date1,date2);
        var seconds = du.getSeconds();
        System.out.println(seconds);
    }
}
