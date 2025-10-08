package main.java.study.mid1.object;

public class Dog {

    private String dogName;
    private int age;

    Dog() {
        this("", 0);
    }

    Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
