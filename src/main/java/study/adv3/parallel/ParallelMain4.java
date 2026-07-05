package main.java.study.adv3.parallel;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static main.java.study.adv3.util.MyLogger.log;

public class ParallelMain4 {

    static void main(String[] args) {

        int processorCount = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        log("processorCount = " + processorCount + ", commonPool = " + commonPool.getParallelism());

        long startTime = System.currentTimeMillis();

        int sum = IntStream.rangeClosed(1, 8)
                .parallel()
                .map(HeavyJob::heavyTask)
                .sum();

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
    }
}
