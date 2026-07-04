package main.java.study.adv3.optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {

    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }

    // 이름이 있으면 이름을 대문자로 출력, 없으면 "UNKNOWN"을 출력해라.
    static void findAndPrint(Long id) {
        String name = findNameById(id);

        // System.out.println("name = " + name.toUpperCase());

        if (name != null) {
            System.out.println("name = " + name.toUpperCase());
        } else {
            System.out.println("name = " + "UNKNOWN");
        }
    }

    static String findNameById(Long id) {
        return map.get(id);
    }
}