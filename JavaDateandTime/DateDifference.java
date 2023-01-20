package book.JavaDateandTime;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;


public class DateDifference {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 1);

        var days = DAYS.between(date1,date2);


        // দিনে পার্থক্য প্রিন্ট করি
        System.out.println(days); // Output: 730

    }
}
