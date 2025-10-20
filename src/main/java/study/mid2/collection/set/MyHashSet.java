package main.java.study.mid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSet() {
        initBuckets();
    }

    public MyHashSet(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        this.buckets = new LinkedList[capacity];

        // 향상된 for 문의 bucket은 향상된 for 문만의 지역 변수이다!
        /*
        for (LinkedList<Integer> bucket : this.buckets) {
            bucket = new LinkedList<>();
        }
         */

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean remove(E value) {
        if (contains(value)) return false;

        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        bucket.remove(value);
        size--;
        return true;
    }

    public boolean contains(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    private int hashIndex(E value) {
        return value.hashCode() % capacity;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + this.size +
                "}";
    }
}
