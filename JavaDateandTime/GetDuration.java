package book.JavaDateandTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class GetDuration {
    public static Duration getDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration;
    }

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2022, 12, 26, 10, 0, 0);
        LocalDateTime end = LocalDateTime.of(2022, 12, 26, 12, 30, 0);

        Duration duration = getDuration(start, end);

        System.out.println(duration);
    }

}
