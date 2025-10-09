package main.java.study.mid1.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {

        Class helloClass = Class.forName("main.java.study.mid1.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
