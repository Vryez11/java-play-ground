package main.java.study.adv3.optional;

import java.util.Optional;

public class OptionalProcessingMain {

    static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무 일도 하지 않음
        optValue.ifPresent(v -> System.out.println("optValue 값: " + v));
        optEmpty.ifPresent(v -> System.out.println("optEmpty 값: " + v));
        System.out.println();

        // 값이 있으면 Consumer 실행, 없으면 Runnable 실행
        optValue.ifPresentOrElse(
                v -> System.out.println("optValue 값: " + v),
                () -> System.out.println("optValue 비어있음")
        );
        optEmpty.ifPresentOrElse(
                v -> System.out.println("optEmpty 값: " + v),
                () -> System.out.println("optEmpty 비어있음")
        );
        System.out.println();

        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);
        System.out.println();

        Optional<Optional<Integer>> nestedOpt = optValue.map(s -> Optional.of(s.length()));
        System.out.println("nestedOpt = " + nestedOpt);
        Optional<Integer> flattenedOpt = optValue.flatMap(s -> Optional.of(s.length()));
        System.out.println("flattenedOpt = " + flattenedOpt);
        System.out.println();

        Optional<String> result1 = optValue.filter(s -> s.length() == 5);
        Optional<String> result2 = optValue.filter(s -> s.startsWith("H"));
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
