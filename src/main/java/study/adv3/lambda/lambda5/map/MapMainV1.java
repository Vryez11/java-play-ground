package main.java.study.adv3.lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV1 {

    public static void main(String[] args) {

        List<String> strings = List.of("1", "12", "123", "1234");

        List<Integer> resulted = map(strings, (a) -> a.length());
        System.out.println("resulted = " + resulted);

        List<Integer> resulted1 = map(strings, a -> Integer.parseInt(a));
        System.out.println("resulted1 = " + resulted1);
    }

    public static <T, S> List<S> map(List<T> list, Function<T, S> function) {
        List<S> result = new ArrayList<>();

        for (T obj : list) {
            result.add(function.apply(obj));
        }

        return result;
    }
}
