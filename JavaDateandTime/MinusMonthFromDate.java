package book.JavaDateandTime;

import java.time.LocalDate;

public class MinusMonthFromDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.minusMonths(10);
        System.out.println(newDate);
    }
}
