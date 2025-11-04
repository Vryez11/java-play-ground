package main.java.study.mid2.collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        foreach(set);
    }

    private static <E> void printAll(Iterator<E> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static <E> void foreach(Iterable<E> iterable) {
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (E i : iterable) {
            System.out.println(i);
        }
    }
}
