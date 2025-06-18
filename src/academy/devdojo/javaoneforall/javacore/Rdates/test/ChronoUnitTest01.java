package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime myBirthday = LocalDateTime.of(2006, Month.OCTOBER, 22,15,0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.SECONDS.between(myBirthday, now));
        System.out.println(ChronoUnit.DAYS.between(myBirthday, now));
        System.out.println(ChronoUnit.WEEKS.between(myBirthday, now));
        System.out.println(ChronoUnit.MONTHS.between(myBirthday, now));
        System.out.println(ChronoUnit.YEARS.between(myBirthday, now));
    }
}
