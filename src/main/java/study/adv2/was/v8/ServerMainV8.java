package main.java.study.adv2.was.v8;

import main.java.study.adv2.was.httpserver.HttpServer;
import main.java.study.adv2.was.httpserver.ServletManager;
import main.java.study.adv2.was.httpserver.annotation.AnnotationServletV1;
import main.java.study.adv2.was.httpserver.annotation.AnnotationServletV2;
import main.java.study.adv2.was.httpserver.servlet.DiscardServlet;
import main.java.study.adv2.was.v7.SearchControllerV7;
import main.java.study.adv2.was.v7.SiteControllerV7;

import java.io.IOException;
import java.util.List;

public class ServerMainV8 {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {

        List<Object> controllers = List.of(new SiteControllerV8(), new SearchControllerV8());
        AnnotationServletV2 annotationServlet = new AnnotationServletV2(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
