package main.java.study.mid1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        String formattedDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅: " + formattedDate);

        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDate);

        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(formatter1);
        System.out.println("날짜와 시간 포맷팅: " + format);

        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateTimeString, formatter1);
        System.out.println("문자열 파싱 날짜와 시간: " + parsed);
    }
}
