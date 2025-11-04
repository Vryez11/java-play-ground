package main.java.study.mid2.collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class MyUserSortMain {

    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] users = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new Comparator<MyUser>() {
            @Override
            public int compare(MyUser o1, MyUser o2) {
                return o1.compareTo(o2);
            }
        }.reversed());
        System.out.println(Arrays.toString(users));
    }
}
