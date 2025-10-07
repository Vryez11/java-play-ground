package main.java.study.start.poly.problem;

public class FaceBookSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다: " + message);
    }
}
