package main.java.study.adv3.methodref;

import main.java.study.adv3.lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class MethodRefEx5 {

    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Park"),
                new Person("Lee")
        );

        List<String> result = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();

        System.out.println("result = " + result);
    }
}
