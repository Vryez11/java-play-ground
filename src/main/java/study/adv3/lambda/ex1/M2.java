package main.java.study.adv3.lambda.ex1;

public class M2 {

    public static void print(int weight, String unit) {
        System.out.println("무게: " + weight + unit);
    }

    public static void main(String[] args) {
        print(10, "kg");
        print(100, "t");
    }
}
