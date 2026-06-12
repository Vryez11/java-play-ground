package main.java.study.adv3.lambda.lambda1;

import main.java.study.adv3.lambda.MyFunction;

public class MyFunction2 {

    public static void main(String[] args) {

        MyFunction myFunction = (a, b) -> {
                return a + b;
        };

        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
