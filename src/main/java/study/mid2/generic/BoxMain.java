package main.java.study.mid2.generic;

public class BoxMain {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(100);

        System.out.println("integerBox.get() = " + integerBox.get());

        if (integerBox.get() instanceof Integer number) {
            System.out.println("number = " + number);
        }
    }
}
