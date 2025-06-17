package academy.devdojo.javaoneforall.javacore.Sformat.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeIT = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIN = new Locale("hi", "IN");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeNL = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormatIT = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
        DateFormat dateFormatCH = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormatIN = DateFormat.getDateInstance(DateFormat.FULL, localeIN);
        DateFormat dateFormatJP = DateFormat.getDateInstance(DateFormat.FULL, localeJP);
        DateFormat dateFormatNL = DateFormat.getDateInstance(DateFormat.FULL, localeNL);

        System.out.println("Sweden format: " + dateFormatCH.format(calendar.getTime()));
        System.out.println("Italy format: " + dateFormatIT.format(calendar.getTime()));
        System.out.println("India format: " + dateFormatIN.format(calendar.getTime()));
        System.out.println("Japan format: " + dateFormatJP.format(calendar.getTime()));
        System.out.println("Netherlands format: " + dateFormatNL.format(calendar.getTime()));

        System.out.println("---------------------------");
        // To see the country
        System.out.println(localeIT.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry(localeIN));
        System.out.println(localeNL.getDisplayLanguage());
        System.out.println(localeNL.getDisplayLanguage(localeCH));

    }
}
