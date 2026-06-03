package main.java.study.adv2.mychat.client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", PORT);

        ReadHandler readHandler = new ReadHandler(socket);
        WriteHandler writeHandler = new WriteHandler(socket);

        Thread readThread = new Thread(readHandler);
        Thread writeThread = new Thread(writeHandler);

        readThread.start();
        writeThread.start();
    }
}
