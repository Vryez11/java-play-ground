package main.java.study.adv2.was.v7;

import main.java.study.adv2.was.httpserver.HttpServer;
import main.java.study.adv2.was.httpserver.ServletManager;
import main.java.study.adv2.was.httpserver.annotation.AnnotationServletV1;
import main.java.study.adv2.was.httpserver.servlet.DiscardServlet;
import main.java.study.adv2.was.httpserver.servlet.reflection.ReflectionServlet;
import main.java.study.adv2.was.v5.servlet.HomeServlet;
import main.java.study.adv2.was.v6.SearchControllerV6;
import main.java.study.adv2.was.v6.SiteControllerV6;

import java.io.IOException;
import java.util.List;

public class ServerMainV7 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        List<Object> controllers = List.of(new SiteControllerV7(), new SearchControllerV7());
        AnnotationServletV1 annotationServlet = new AnnotationServletV1(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
