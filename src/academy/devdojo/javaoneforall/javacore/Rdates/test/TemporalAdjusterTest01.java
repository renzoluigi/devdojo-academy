package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class GetNextBusinessDay implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS); // Plus value of addDays to days (what do you want to do with the temporal will the method receive)
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(new GetNextBusinessDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(19).with(new GetNextBusinessDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(20).with(new GetNextBusinessDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
