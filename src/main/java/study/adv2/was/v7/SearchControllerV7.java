package main.java.study.adv2.was.v7;

import main.java.study.adv2.was.httpserver.HttpRequest;
import main.java.study.adv2.was.httpserver.HttpResponse;
import main.java.study.adv2.was.httpserver.annotation.Mapping;

public class SearchControllerV7 {

    @Mapping("/search")
    public void search(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");

        response.writeBody("<h1>Search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
