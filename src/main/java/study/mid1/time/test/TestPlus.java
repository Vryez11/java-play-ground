package main.java.study.mid1.time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestPlus {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);

        Period period = Period.of(1, 2, 3);
        Duration duration = Duration.of(4, ChronoUnit.HOURS);

        LocalDateTime plusPeriod = ldt.plus(period);
        LocalDateTime plusDuration = plusPeriod.plus(duration);

        System.out.println("기준 시각: " + ldt);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusDuration);

        LocalDateTime futerDateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("futerDateTime = " + futerDateTime);

        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(date.plusWeeks(i * 2));
        }

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period between = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "개월 " + between.getDays() + "일");
        System.out.println("디데이: " + daysBetween);

        int year = 2024;
        int month = 1;

        LocalDate date1 = LocalDate.of(year, month, 1);

        LocalDate withFirstDate = date1.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate withLastDate = date1.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(withFirstDate.getDayOfWeek());
        System.out.println(withLastDate.getDayOfWeek());
    }
}
