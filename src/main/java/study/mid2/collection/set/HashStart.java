package main.java.study.mid2.collection.set;

import java.util.LinkedList;

public class HashStart {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 10);
        add(buckets, 345);
        add(buckets, 1034);
        add(buckets, 31);
        add(buckets, 35);
        add(buckets, 2789);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {

        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {

        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
