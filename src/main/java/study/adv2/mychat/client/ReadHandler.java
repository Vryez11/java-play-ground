package main.java.study.adv2.mychat.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import static main.java.study.adv2.util.MyLogger.log;

public class ReadHandler implements Runnable{

    private final Socket socket;
    private final DataInputStream input;

    public ReadHandler(Socket socket) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {

        try {
            String strFromServer = input.readUTF();
            log("받은 메세지: " + strFromServer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
