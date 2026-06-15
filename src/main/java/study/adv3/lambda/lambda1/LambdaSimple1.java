package main.java.study.adv3.lambda.lambda1;

import main.java.study.adv3.lambda.MyFunction;

public class LambdaSimple1 {

    public static void main(String[] args) {

        MyFunction function1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("function1 = " + function1.apply(1, 2));

        // 단일 표현식인 경우 중괄호와 리턴 생략 가능
        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("function2.apply(1, 2) = " + function2.apply(1, 2));


        MyFunction myFunction3 = (a, b) -> a + b;
        System.out.println("myFunction3 = " + myFunction3.apply(1, 2));
    }
}
