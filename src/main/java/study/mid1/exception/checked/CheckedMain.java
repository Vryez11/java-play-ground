package main.java.study.mid1.exception.checked;

public class CheckedMain {

    public static void main(String[] args) throws MyCheckedException {

        Service service = new Service();
        // service.callCatch();
        // service.callThrow();
        System.out.println("정상 종료");
    }
}
