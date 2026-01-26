package main.java.study.adv1.thread.bounded;

public interface BoundedQueue {

    void put(String data);

    String take();
}
