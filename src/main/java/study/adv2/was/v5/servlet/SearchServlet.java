package main.java.study.adv2.was.v5.servlet;

import main.java.study.adv2.was.httpserver.HttpRequest;
import main.java.study.adv2.was.httpserver.HttpResponse;
import main.java.study.adv2.was.httpserver.HttpServlet;

public class SearchServlet implements HttpServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");
        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
