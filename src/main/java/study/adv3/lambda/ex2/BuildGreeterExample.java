package main.java.study.adv3.lambda.ex2;

public class BuildGreeterExample {

    public static StringFunction buildGreeter(String greeting) {
        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {

        String applied = buildGreeter("Hello").apply("Java");
        System.out.println(applied);

        String applied1 = buildGreeter("Hi").apply("Lambda");
        System.out.println(applied1);
    }
}
