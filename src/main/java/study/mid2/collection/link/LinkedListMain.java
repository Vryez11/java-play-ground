package main.java.study.mid2.collection.link;

public class LinkedListMain {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println("첫 번째 항목에 추가");
        list.add(0, 10);
        System.out.println(list);

        System.out.println("첫 번째 항목 삭제");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(1, 100);
        System.out.println(list);

        System.out.println("중간 항목 삭제");
        list.remove(1);
        System.out.println(list);
    }
}
