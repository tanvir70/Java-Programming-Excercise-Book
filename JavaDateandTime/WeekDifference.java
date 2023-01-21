package book.JavaDateandTime;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.WEEKS;

public class WeekDifference {
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 1);
        var days = WEEKS.between(date1,date2);
        System.out.println(days);
    }
}