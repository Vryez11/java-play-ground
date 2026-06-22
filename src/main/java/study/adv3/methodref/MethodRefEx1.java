package main.java.study.adv3.methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {

        // 1. 정적 메서드 참조
        Supplier<String> staticMethod1 = () -> Person.greeting();
        Supplier<String> staticMethod2 = Person::greeting;

        System.out.println("staticMethod1: " + staticMethod1.get());
        System.out.println("staticMethod2 = " + staticMethod2.get());

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Supplier<String> instanceMethod = person::introduce;

        System.out.println("instanceMethod = " + instanceMethod.get());

        // 3. 생성자 참조
        Supplier<Person> newPerson = Person::new;

    }
}
