package main.java.study.start.poly;

public class CastingMain {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call2(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }

    // 자바 16부터 Pattern Matching for instanceof
    // instanceof를 사용하면서 동시에 변수를 선언할 수 있다.
    private static void call2(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
