package main.java.study.adv2.reflection;

import main.java.study.adv2.reflection.data.BasicData;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstructV2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<BasicData> aClass = BasicData.class;

        Constructor<BasicData> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        BasicData Instance = constructor.newInstance("Instance");
        System.out.println("Instance = " + Instance);

        Method method = aClass.getDeclaredMethod("call");
        method.invoke(Instance);
    }
}
