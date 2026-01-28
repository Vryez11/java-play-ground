package main.java.study.adv1.thread.cas.increment;

public class BasicInteger implements IncrementInteger {

    private int value;

    @Override
    public void increment() {
        this.value++;
    }

    @Override
    public int get() {
        return this.value;
    }
}
