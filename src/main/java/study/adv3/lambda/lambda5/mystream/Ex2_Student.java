package main.java.study.adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;

import static main.java.study.adv3.lambda.lambda5.filter.GenericFilter.filter;
import static main.java.study.adv3.lambda.lambda5.map.GenericMapper.map;

public class Ex2_Student {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);
        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();
        for (Student student : students) {

            if (student.getScore() >= 80) {
                result.add(student.getName());
            }
        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {
        List<Student> filtered = filter(students, s -> s.getScore() >= 80);
        return map(filtered, s -> s.getName());
    }
}
