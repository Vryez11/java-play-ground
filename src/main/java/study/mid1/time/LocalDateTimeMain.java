package main.java.study.mid1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜+10d = " + plusDays);

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("ofTimePlus = " + ofTimePlus);

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus21Year = ofDt.plusYears(21);
        System.out.println("ofDtPlus21Year = " + ofDtPlus21Year);

        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날싸시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
