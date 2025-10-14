package main.java.study.mid1.exception.unchecked;

public class UncheckedMain {

    public static void main(String[] args) throws MyUncheckedException {

        Service service = new Service();
        // service.callCatch();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
