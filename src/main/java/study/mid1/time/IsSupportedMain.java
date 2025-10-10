package main.java.study.mid1.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class IsSupportedMain {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }
    }
}
