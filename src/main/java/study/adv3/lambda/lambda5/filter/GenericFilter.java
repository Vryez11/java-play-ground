package main.java.study.adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T obj : list) {
            if (predicate.test(obj)) {
                filtered.add(obj);
            }
        }
        return filtered;
    }
}
