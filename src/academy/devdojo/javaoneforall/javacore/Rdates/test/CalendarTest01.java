package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // Calendar
        System.out.println(c);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week!");
        }

        System.out.println(c.get(Calendar.DATE)); // Receives a field (constant with a value of the position of the info)
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 7); // To add
        c.roll(Calendar.HOUR, 15); // Add, but don't change the day, month, year, etc.
        Date date = c.getTime();
        System.out.println(date); // To format
    }
}
