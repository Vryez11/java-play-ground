package main.java.study.adv3.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample1 {

    public static List<String> map(List<String> list, UnaryOperator<String> func) {

        List<String> result = new ArrayList<>();

        for (String word : list) {
            result.add(func.apply(word));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        List<String> upperWords = map(words, s -> s.toUpperCase());
        System.out.println("대문자 반환 결과: " + upperWords);

        List<String> starWords = map(words, s -> "***" + s + "***");
        System.out.println("특수문자 데코 결과: " + starWords);
    }
}
