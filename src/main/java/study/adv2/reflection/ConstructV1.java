package main.java.study.adv2.reflection;

import main.java.study.adv2.reflection.data.BasicData;

import java.lang.reflect.Constructor;

public class ConstructV1 {

    public static void main(String[] args) {

        Class<BasicData> aClass = BasicData.class;

        System.out.println("==== constructors() ====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("==== constructors() ====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }
}
