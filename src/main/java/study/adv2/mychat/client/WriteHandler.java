package main.java.study.adv2.mychat.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class WriteHandler implements Runnable{

    private final Socket socket;
    private final DataOutputStream output;
    private final Scanner sc;

    public WriteHandler(Socket socket) throws IOException {
        this.socket = socket;
        this.output = new DataOutputStream(socket.getOutputStream());

        sc = new Scanner(System.in);
    }

    @Override
    public void run() {
        while (true) {

            System.out.print("입력하세요: ");
            String writeFromClient = sc.next();
            try {
                output.writeUTF(writeFromClient);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
