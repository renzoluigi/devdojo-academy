package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 12, 32);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        System.out.println(time.get(ChronoField.AMPM_OF_DAY));

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
    }
}
