package main.java.study.adv3.stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    static void main(String[] args) {
        // 기본 기능
        List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toList());
        list.add("Hello");
        System.out.println("list = " + list);

        List<Integer> list2 = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("list2 = " + list2);

        Set<Integer> set = Stream.of(1, 2, 3, 3, 4, 5, 6, 6)
                .collect(Collectors.toSet());
        System.out.println("set = " + set);

        TreeSet<Integer> treeSet = Stream.of(3, 4, 4, 4, 5, 1, 2)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);
    }
}
