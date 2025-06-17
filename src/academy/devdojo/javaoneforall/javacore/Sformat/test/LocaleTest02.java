package academy.devdojo.javaoneforall.javacore.Sformat.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // The default language of your system
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
    }
}
