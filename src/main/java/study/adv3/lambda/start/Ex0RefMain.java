package main.java.study.adv3.lambda.start;

public class Ex0RefMain {

    public static void main(String[] args) {
        helloPrint("Java");
        helloPrint("Spring");
    }

    public static void helloPrint(String str) {
        System.out.println("프로그램 시작");

        System.out.println("Hello " + str);

        System.out.println("프로그램 종료");
    }
}
