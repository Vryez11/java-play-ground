package main.java.study.start.access;

public class MaxCounter {

    private int count;
    private int maxCount;

    MaxCounter(int maxCount) {
        this.count = 0;
        this.maxCount = maxCount;
    }

    public void increment() {
        if (count >= maxCount) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        count++;
    }

    public int getCount() {
        return count;
    }
}
