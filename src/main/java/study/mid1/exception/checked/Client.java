package main.java.study.mid1.exception.checked;

public class Client {

    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}
