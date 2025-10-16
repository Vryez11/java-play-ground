package main.java.study.mid2.collection.array;

public class MyArrayListMain {

    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>(3);
        System.out.println(myArrayList);

        myArrayList.add(1);
        System.out.println(myArrayList);
        myArrayList.add(2);
        System.out.println(myArrayList);
        myArrayList.add(3);
        System.out.println(myArrayList);
        myArrayList.add(4);
        System.out.println(myArrayList);
        myArrayList.add(5);
        System.out.println(myArrayList);
        myArrayList.add(6);
        System.out.println(myArrayList);
        myArrayList.add(7);
        System.out.println(myArrayList);
        myArrayList.add(8);
        System.out.println(myArrayList);
        myArrayList.add(9);
        System.out.println(myArrayList);
        myArrayList.add(10);
        System.out.println(myArrayList);
        myArrayList.add(11);
        System.out.println(myArrayList);

        myArrayList.addFirst(10);
        System.out.println(myArrayList);
        myArrayList.add(5, 100);
        System.out.println(myArrayList);
    }
}
