package main.java.study.adv3.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        List<Integer> negatives = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println("음수만: " + negatives);

        List<Integer> evens = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        System.out.println("짝수만 : " + evens);
    }
}
