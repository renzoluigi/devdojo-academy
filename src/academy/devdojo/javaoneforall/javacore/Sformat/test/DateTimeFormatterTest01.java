package academy.devdojo.javaoneforall.javacore.Sformat.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String format1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String format3 = localDate.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);

        LocalDate parse1 = LocalDate.parse("20250618", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-06-18", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse3 = LocalDate.parse("2025-06-18+05:00", DateTimeFormatter.ISO_DATE); // This works with offset too
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String format4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format4);
        LocalDateTime parse4 = LocalDateTime.parse("2025-06-18T20:21:19.5922361", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // Creating formatters
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = localDate.format(formatterBr);
        System.out.println(formatBr);

        // Format + switch language
        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGr = localDate.format(formatterGr);
        System.out.println(formatGr);
        LocalDate parsedGr = LocalDate.parse(formatGr, formatterGr);
        System.out.println(parsedGr);
    }
}
