package main.java.study.adv2.chat.server.command;

import main.java.study.adv2.chat.server.Session;

import java.io.IOException;

public class ExitCommand implements Command{

    @Override
    public void execute(String[] args, Session session) throws IOException {
        throw new IOException("exit");
    }
}