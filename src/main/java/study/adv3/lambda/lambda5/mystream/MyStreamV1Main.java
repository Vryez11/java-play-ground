package main.java.study.adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        List<Integer> list = stream.filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("list = " + list);
    }
}
