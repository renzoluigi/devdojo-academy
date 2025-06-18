package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {
        System.out.println(nextBusinessDay(DayOfWeek.MONDAY));
        System.out.println(nextBusinessDay(DayOfWeek.TUESDAY));
        System.out.println(nextBusinessDay(DayOfWeek.WEDNESDAY));
        System.out.println(nextBusinessDay(DayOfWeek.THURSDAY));
        System.out.println(nextBusinessDay(DayOfWeek.FRIDAY));
        System.out.println(nextBusinessDay(DayOfWeek.SATURDAY));
        System.out.println(nextBusinessDay(DayOfWeek.SUNDAY));
    }

    public static TemporalAdjuster nextBusinessDay(DayOfWeek dayOfWeek) {
        if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.TUESDAY || dayOfWeek == DayOfWeek.WEDNESDAY || dayOfWeek == DayOfWeek.THURSDAY) { // With Friday as a business day :)
            return dayOfWeek.plus(1);
        }
        else {
            return DayOfWeek.MONDAY;
        }
    }
}
