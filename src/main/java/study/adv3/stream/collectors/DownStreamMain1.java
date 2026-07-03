package main.java.study.adv3.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {

    static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Lee", 1, 85),
                new Student("Park", 1, 70),
                new Student("Kim", 2, 20),
                new Student("Han", 2, 90),
                new Student("Min", 3, 95),
                new Student("Song", 2, 70),
                new Student("Hon", 3, 50),
                new Student("Son", 1, 30)
        );

        // 1단계: 학년별로 학생들을 그룹화 해라
        Map<Integer, List<Student>> colleted1_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade, // 그룹화의 기준
                        Collectors.toList()
                ));
        System.out.println("colleted1_1 = " + colleted1_1);

        // 다운스트림에서 toList() 생략 가능
        Map<Integer, List<Student>> colleted1_2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade
                ));
        System.out.println("colleted1_2 = " + colleted1_2);

        // 2단계: 학년별로 학생들의 이름을 출력해라.
        Map<Integer, List<String>> collected2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, // 다운스트림 1: 학생 -> 이름 변환
                                Collectors.toList()) // 다운스트림 2: 변환된 값(이름)을 List로 수집
                ));
        System.out.println("collected2 = " + collected2);

        // 3단계: 학년별로 학생들의 수를 출력해라.
        Map<Integer, Long> collected3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()
                ));
        System.out.println("collected3 = " + collected3);
    }
}
