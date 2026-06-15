package main.java.study.adv3.lambda.ex1;

import java.util.Arrays;

public class M4 {

    public static void main(String[] args) {

        measure(() -> {
            int sum = 0;

            for (int i = 0; i <= 100; i++) {
                sum += i;
            }

            System.out.println("[1부터 100까지 합] 결과: " + sum);
        });

        int[] arr = {4, 3, 2, 1};
        measure(() -> {
            System.out.println("원본 배열: " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("정렬 배열: " + Arrays.toString(arr));
        });
    }

    public static void measure(Process process) {
        long start = System.nanoTime();

        process.run();

        long end = System.nanoTime();

        System.out.println("걸린 시간: " + (end - start) + "ns");
    }
}
