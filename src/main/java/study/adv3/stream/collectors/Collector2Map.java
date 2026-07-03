package main.java.study.adv3.stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector2Map {

    static void main(String[] args) {

        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));
        System.out.println("map1 = " + map1);

        /*
        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));
        System.out.println("map2 = " + map2);
         */

        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        Integer::sum
                ));

        // Map의 타입 지정
        System.out.println("map3 = " + map3);

        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        Integer::sum,
                        TreeMap::new
                ));
        System.out.println("map4 = " + map4);
    }
}
