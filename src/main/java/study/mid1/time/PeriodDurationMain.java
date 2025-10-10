package main.java.study.mid1.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDurationMain {

    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("현재 날짜: " + currentDate);
        System.out.println("더한 날짜: " + plusDate);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");

        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("기준 시간 = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간 = " + plusTime);

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between1 = Duration.between(start, end);
        System.out.println("차이: " + between1.getSeconds() + "초");
        System.out.println("근무 시간: " + between1.toHours() + "시간 " + between1.toMinutesPart() + "분");
    }
}
