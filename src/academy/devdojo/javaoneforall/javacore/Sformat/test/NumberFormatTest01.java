package academy.devdojo.javaoneforall.javacore.Sformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeUS = Locale.US;

        NumberFormat[] nfs = new NumberFormat[4];
        nfs[0] = NumberFormat.getInstance();
        nfs[1] = NumberFormat.getInstance(localeJP);
        nfs[2] = NumberFormat.getInstance(localeIT);
        nfs[3] = NumberFormat.getInstance(localeUS);

        double value = 10_000.21923;
        for (NumberFormat nf : nfs) {
            System.out.println(nf.getMaximumFractionDigits());
            nf.setMaximumFractionDigits(2);
            System.out.println(nf.format(value));
        }

        String stringValue = "10_000.21923";
        try {
            System.out.println(nfs[0].parse(stringValue)); // 10 because '_' isn't a character
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
