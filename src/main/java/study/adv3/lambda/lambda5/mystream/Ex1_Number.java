package main.java.study.adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;

import static main.java.study.adv3.lambda.lambda5.filter.GenericFilter.filter;
import static main.java.study.adv3.lambda.lambda5.map.GenericMapper.map;

public class Ex1_Number {

    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = direct(numbers);
        System.out.println("result = " + result);

        List<Integer> mapped = lambda(numbers);
        System.out.println("mapped = " + mapped);
    }

    private static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) result.add(number);
        }
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) * 2);
        }
        return result;
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filtered = filter(numbers, s -> s % 2 == 0);
        List<Integer> mapped = map(filtered, s -> s * 2);
        return mapped;
    }
}
