package main.java.study.adv2.chat.server.command;

import main.java.study.adv2.chat.server.Session;

import java.io.IOException;

public interface Command {
    void execute(String[] args, Session session) throws IOException;
}
