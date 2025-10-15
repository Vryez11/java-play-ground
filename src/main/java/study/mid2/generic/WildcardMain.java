package main.java.study.mid2.generic;

import main.java.study.mid2.generic.animal.Animal;
import main.java.study.mid2.generic.animal.Cat;
import main.java.study.mid2.generic.animal.Dog;

import static main.java.study.mid2.generic.WildcardEx.*;

public class WildcardMain {

    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));

        printGenericV1(dogBox);
        printWildcardV1(dogBox);

        printGenericV2(dogBox);
        printWildcardV2(dogBox);

        Dog dog = printAndReturnGeneric(dogBox);
        Animal animal = printAndReturnWildcard(dogBox);
    }
}
