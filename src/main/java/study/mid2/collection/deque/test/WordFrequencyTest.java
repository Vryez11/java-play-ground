package main.java.study.mid2.collection.deque.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        String[] strings = text.split(" ");
        Map<String, Integer> stringMap = new HashMap<>();

        for (String string : strings) {
            stringMap.put(string, stringMap.getOrDefault(string, 0) + 1);
        }

        System.out.println(stringMap);
    }
}
