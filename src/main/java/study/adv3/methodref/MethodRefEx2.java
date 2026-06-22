package main.java.study.adv3.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {

        // 1. 정적 메서드 참조
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
        Function<String, String> staticMethod2 = Person::greetingWithName;

        System.out.println("staticMethod1: " + staticMethod1.apply("Kim"));
        System.out.println("staticMethod2 = " + staticMethod2.apply("Kim"));

        // 2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");
        Function<Integer, String> instanceMethod = person::introduceWithNumber;
        System.out.println("instanceMethod = " + instanceMethod.apply(20));

        // 3. 생성자 참조
        Supplier<Person> newPerson = Person::new;
        Function<String, Person> newPerson1 = name -> new Person(name);
        Function<String, Person> newPerson2 = Person::new;

    }
}
