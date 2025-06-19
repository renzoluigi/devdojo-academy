package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class ChronologyTest01 {
    public static void main(String[] args) {
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);

        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2, 2);
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
