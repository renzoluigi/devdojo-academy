package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withMonth(10);

        now = now.with(ChronoField.DAY_OF_MONTH, 22);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate nextOrSameDayOfWeek = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(nextOrSameDayOfWeek);
        System.out.println(nextOrSameDayOfWeek.getDayOfWeek());

        LocalDate nextActualDayOfWeek = now.with(TemporalAdjusters.next(now.getDayOfWeek()));
        System.out.println(nextActualDayOfWeek);
        System.out.println(nextActualDayOfWeek.getDayOfWeek());

        LocalDate previousActualDayOfWeek = now.with(TemporalAdjusters.previous(now.getDayOfWeek())); //or previousOrSame
        System.out.println(previousActualDayOfWeek);
        System.out.println(previousActualDayOfWeek.getDayOfWeek());

        LocalDate firstDayOfActualMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfActualMonth);
        System.out.println(firstDayOfActualMonth.getDayOfWeek());

        LocalDate lastDayOfActualMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfActualMonth);
        System.out.println(lastDayOfActualMonth.getDayOfWeek());

        LocalDate firstDayOfNextYear = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(firstDayOfNextYear);
        System.out.println(firstDayOfNextYear.getDayOfWeek());

        LocalDate firstDayOfNextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(firstDayOfNextMonth);
        System.out.println(firstDayOfNextMonth.getDayOfWeek());

        LocalDate lastDayOfWeekInMonth = now.with(TemporalAdjusters.lastInMonth(now.getDayOfWeek()));
        System.out.println(lastDayOfWeekInMonth);
        System.out.println(lastDayOfWeekInMonth.getDayOfWeek());
    }
}
