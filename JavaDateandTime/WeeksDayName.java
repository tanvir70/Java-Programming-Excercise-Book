package book.JavaDateandTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeeksDayName {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2220,1,1);

        DayOfWeek name = date.getDayOfWeek();

        System.out.println(name);
    }

}
