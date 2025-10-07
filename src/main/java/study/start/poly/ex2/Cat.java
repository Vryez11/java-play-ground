package main.java.study.start.poly.ex2;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("냐용");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
