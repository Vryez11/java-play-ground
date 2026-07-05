package main.java.study.adv3.parallel;

import main.java.study.adv3.util.MyLogger;

import java.util.stream.IntStream;

import static main.java.study.adv3.util.MyLogger.*;

public class ParallelMain1 {

    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .map(HeavyJob::heavyTask)
                .reduce(0, Integer::sum);

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
    }
}
