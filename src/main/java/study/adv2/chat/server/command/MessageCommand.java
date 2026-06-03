package main.java.study.adv2.chat.server.command;

import main.java.study.adv2.chat.server.Session;
import main.java.study.adv2.chat.server.SessionManager;

import java.io.IOException;

public class MessageCommand implements Command{

    private final SessionManager sessionManager;

    public MessageCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        String message = args[1];
        sessionManager.sendAll("[" + session.getUsername() + "] " + message);
    }
}
