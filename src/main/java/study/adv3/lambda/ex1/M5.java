package main.java.study.adv3.lambda.ex1;

import main.java.study.adv3.lambda.MyFunction;

public class M5 {

    public static void main(String[] args) {
        int result1 = getOperation("add").apply(1, 2);
        int result2 = getOperation("sub").apply(1, 2);
        int result3 = getOperation("xxx").apply(1, 2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    static MyFunction getOperation(String operator) {
        return switch (operator) {
            case "add" -> (a, b) -> a + b;
            case "sub" -> (a, b) -> a - b;
            default -> (a, b) -> 0;
        };
    }
}
