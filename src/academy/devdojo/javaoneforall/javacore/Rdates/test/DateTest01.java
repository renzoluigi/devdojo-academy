package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) { // Works with longs
        Date date = new Date();
        System.out.println(date.getTime()); // The actual date

        Date date2 = new Date(1749956090770L); // Works with milliseconds after December 31st 1969 from long value
        System.out.println(date2);

        date2.setTime(date2.getTime() + 3_600_000); // + 1 hour
        System.out.println(date2);
    }
}
