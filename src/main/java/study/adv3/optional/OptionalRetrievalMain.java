package main.java.study.adv3.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalRetrievalMain {

    static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // isPresent(): 값이 있으면 true
        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println();

        System.out.println("optValue.get() = " + optValue.get());
        try {
            System.out.println("optEmpty.get() = " + optEmpty.get());
        } catch (NoSuchElementException e) {
            System.out.println("빈 Optional 값 획득 시도");
        }
        System.out.println();

        System.out.println("optEmpty.orElse(\"기본값\") = " + optEmpty.orElse("기본값"));
        System.out.println();

        String value2 = optValue.orElseGet(() -> {
            System.out.println("람다 호출 - optValue");
            return "New Value";
        });
        System.out.println("value2 = " + value2);
        String empty2 = optEmpty.orElseGet(() -> {
            System.out.println("람다 호출 - optEmpty");
            return "New Value";
        });
        System.out.println("empty2 = " + empty2);
        System.out.println();

        try {
            String empty3 = optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다."));
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println();

        Optional<String> result1 = optValue.or(() -> Optional.of("Fallback"));
        System.out.println("result1 = " + result1);
        Optional<String> result2 = optEmpty.or(() -> Optional.of("Fallback"));
        System.out.println("result2 = " + result2);
    }
}
