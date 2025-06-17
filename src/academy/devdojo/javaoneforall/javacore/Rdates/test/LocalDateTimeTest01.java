package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);
        System.out.println(localDateTimeNow.getYear());
        System.out.println(localDateTimeNow.getHour());

        LocalDate date = LocalDate.parse("2020-12-01");
        LocalTime time = LocalTime.parse("11:37:21");
        LocalDateTime localDateTime1 = date.atTime(time); // Or we can pass the parameters "11, 37, 21"
        LocalDateTime localDateTime2 = time.atDate(date); // Or we can pass the parameters "2020, Month.DECEMBER, 1"

        System.out.println(localDateTime1);

    }
}
