package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.OCTOBER, 30); // You can pass the enum referring to the month or the month number.

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(date.toString());

        LocalDate now = LocalDate.now();
        System.out.println(now);
        now = now.plusWeeks(2);
        System.out.println(now);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
