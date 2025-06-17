package academy.devdojo.javaoneforall.javacore.Sformat.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'São Paulo', dd 'de' MMMM 'de' yyyy, H 'horas' 'e' mm 'minutos'");
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("São Paulo, 16 de junho de 2025, 1 horas e 20 minutos")); // parse to Date
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
