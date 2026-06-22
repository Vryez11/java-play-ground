package main.java.study.adv3.methodref;

import java.util.function.BiFunction;

public class MethodRefEx6 {

    public static void main(String[] args) {

        Person person = new Person("Kim");

        BiFunction<Person, Integer, String> fun1 = (Person p, Integer number) -> p.introduceWithNumber(number);
        System.out.println("person.upperName = " + fun1.apply(person, 10));

        BiFunction<Person, Integer, String> fun2 = Person::introduceWithNumber;
        System.out.println("person.upperName2 = " + fun2.apply(person, 20));
    }
}
