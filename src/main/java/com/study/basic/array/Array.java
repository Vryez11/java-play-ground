package main.java.com.study.basic.array;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);

        int[] scores = {90, 80, 70, 60, 50};

        for (int score : scores) {
            System.out.println("score = " + score);
        }
    }
}
