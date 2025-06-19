package academy.devdojo.javaoneforall.javacore.Rdates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        //ZoneId
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); // or .values()
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoTimeZone = ZoneId.of("Asia/Tokyo");
        ZoneId parisDateTime = ZoneId.of("Europe/Paris");
        System.out.println(ZoneId.of("America/Sao_Paulo"));
        System.out.println(tokyoTimeZone);
        System.out.println(parisDateTime);

        //ZonedDateTime
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = now.atZone(parisDateTime); // No converted
        System.out.println(zonedDateTime1);

        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime2 = instant.atZone(parisDateTime); // Time converted to referent zone
        System.out.println(zonedDateTime2);

        // ZoneOffset
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00"); // Needs to be in this format, anything else this is wrong

        // OffsetDateTime
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = instant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);
        OffsetDateTime offsetDateTime4 = OffsetDateTime.ofInstant(instant, offsetManaus);
        System.out.println(offsetDateTime4);
    }
}
