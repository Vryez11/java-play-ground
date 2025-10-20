package main.java.study.mid2.collection.set;

public class MyHashSetMain {

    public static void main(String[] args) {


        MyHashSet<Integer> IntegerSet = new MyHashSet<>(10);
        IntegerSet.add(1);
        IntegerSet.add(102);
        IntegerSet.add(31);
        IntegerSet.add(12);
        IntegerSet.add(5);
        IntegerSet.add(8);
        IntegerSet.add(14);
        IntegerSet.add(9);
        IntegerSet.add(99);
        System.out.println(IntegerSet);

        MyHashSet<String> stringSet = new MyHashSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("AB");
        stringSet.add("SET");
        System.out.println(stringSet);

        System.out.println("A.hashCode=" + "A".hashCode());
        System.out.println("B.hashCode=" + "B".hashCode());

        String searchValue = "SET";
        boolean res = stringSet.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + res);
    }
}
