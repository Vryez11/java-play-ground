package main.java.study.adv3.lambda.ex1;

public class M1 {

    public static void greet(String message) {
        System.out.println("==== 시작 =====");
        System.out.println(message);
        System.out.println("==== 끝 =====");
    }

    public static void main(String[] args) {
        greet("Good Morning!");
        greet("Good Afternoon!");
        greet("Good Evening!");
    }
}
