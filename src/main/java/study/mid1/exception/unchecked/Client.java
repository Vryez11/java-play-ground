package main.java.study.mid1.exception.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }
}
