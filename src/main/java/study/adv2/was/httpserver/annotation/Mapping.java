package main.java.study.adv2.was.httpserver.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Mapping {

    String value();
}
