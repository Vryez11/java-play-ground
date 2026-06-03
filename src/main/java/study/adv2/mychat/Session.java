package main.java.study.adv2.mychat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Session implements Runnable{

    private final Socket socket;
    private final SessionManager sessionManager;
    private final DataInputStream input;
    private final DataOutputStream output;


    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.sessionManager = sessionManager;

        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {

        try {
            String received = input.readUTF();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
