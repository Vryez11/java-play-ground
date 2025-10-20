package main.java.study.mid2.collection.set.test;

import java.util.*;

public class TestMain {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>(List.of(inputArr));

        System.out.println("set = " + set);
        for (Integer s : set) {
            System.out.println(s);
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of(inputArr));
        System.out.println("linkedHashSet = " + linkedHashSet);
        for (Integer s : linkedHashSet) {
            System.out.println(s);
        }

        Set<Integer> treeSet = new TreeSet<>(List.of(inputArr));
        System.out.println("treeSet = " + treeSet);
        for (Integer i : treeSet) {
            System.out.println(i);
        }

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union = " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference = " + difference);
    }
}
