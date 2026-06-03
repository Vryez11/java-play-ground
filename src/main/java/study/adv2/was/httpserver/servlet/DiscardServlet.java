package main.java.study.adv2.was.httpserver.servlet;

import main.java.study.adv2.was.httpserver.HttpRequest;
import main.java.study.adv2.was.httpserver.HttpResponse;
import main.java.study.adv2.was.httpserver.HttpServlet;

import java.io.IOException;

public class DiscardServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        // empty
    }
}
