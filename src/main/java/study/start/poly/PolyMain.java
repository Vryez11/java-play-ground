package main.java.study.start.poly;

public class PolyMain {

    public static void main(String[] args) {

        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        System.out.println("Child로 다운 캐스팅");
        Child polyChild = (Child) poly;
        polyChild.childMethod();
    }
}
