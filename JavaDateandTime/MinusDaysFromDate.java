package book.JavaDateandTime;

import java.time.LocalDate;

public class MinusDaysFromDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,1,1);

        LocalDate newDate = date.minusDays(10);

        System.out.println(newDate);
    }
}
