package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowBeforeFiveYears = now.minusYears(5).minusMonths(3).plusMinutes(8);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowAfterSevenHours = timeNow.plusHours(7);

        Duration d1 = Duration.between(now, nowBeforeFiveYears);
        Duration d2 = Duration.between(timeNow, timeNowAfterSevenHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(5);
        Duration d6 = Duration.of(400, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6.toDays());

//        Duration.between(LocalDate.now(), LocalDate.now().plusWeeks(2)); // Can't do this because the class LocalDate don't have the unit seconds
    }
}
