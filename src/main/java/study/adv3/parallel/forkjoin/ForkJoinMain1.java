package main.java.study.adv3.parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static main.java.study.adv3.util.MyLogger.log;

public class ForkJoinMain1 {

    static void main(String[] args) {

        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();

        log("[생성] " + data);

        // ForkJoinPool 생성 및 작업 수행
        long startTime = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(data);

        Integer result = pool.invoke(task);
        pool.close();

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + result);
        log("pool: " + pool);
    }
}
