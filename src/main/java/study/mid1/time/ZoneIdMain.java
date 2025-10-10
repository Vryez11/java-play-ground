package main.java.study.mid1.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        for (String availableZoneId : availableZoneIds) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
