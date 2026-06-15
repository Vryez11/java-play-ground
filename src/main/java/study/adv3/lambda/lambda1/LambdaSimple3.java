package main.java.study.adv3.lambda.lambda1;

public class LambdaSimple3 {

    public static void main(String[] args) {

        MyCall myCall1 = (int value) -> value * 2;
        MyCall myCall2 = (value) -> value * 2;
        MyCall myCall3 = value -> value * 2; // 매개변수 1개 일 때만 괄호() 생략 가능
    }

    interface MyCall {
        int call(int value);
    }
}
