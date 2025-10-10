package main.java.study.mid1.time;

import java.time.*;

public class ZonedDateTimeMain {

    public static void main(String[] args) {

        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt);

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt1 = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt1 = " + ldt1);

        OffsetDateTime odt = OffsetDateTime.of(ldt1, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
