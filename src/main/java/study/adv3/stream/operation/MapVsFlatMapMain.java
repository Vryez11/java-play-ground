package main.java.study.adv3.stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {

    static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        System.out.println("outerList = " + outerList);

        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer number : list) {
                forResult.add(number);
            }
        }
        System.out.println("forResult = " + forResult);

        // map
        List<Stream<Integer>> mapResult = outerList.stream()
                .map(List::stream)
                .toList();
        System.out.println("mapResult = " + mapResult);

        // flapMap
        List<Integer> flapMapResult = outerList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("flapMapResult = " + flapMapResult);
    }
}
