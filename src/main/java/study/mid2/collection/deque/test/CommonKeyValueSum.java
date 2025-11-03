package main.java.study.mid2.collection.deque.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> res = new HashMap<>();

        for (String key1 : map1.keySet()) {
            if (map2.containsKey(key1)) {
                res.put(key1, map1.get(key1) + map2.get(key1));
            }
            /*
            for (String key2 : map2.keySet()) {
                if (key1.equals(key2)) {
                    res.put(key2, map1.get(key2) + map2.get(key2));
                }
            }
             */
        }

        System.out.println(res);
    }
}
