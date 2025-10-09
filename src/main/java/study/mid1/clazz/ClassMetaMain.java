package main.java.study.mid1.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {

        Class clazz1 = String.class;
        Class clazz2 = new String().getClass();
        Class clazz3 = Class.forName("java.lang.String");

        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("Superclass: " + clazz1.getSuperclass().getName());

        Class[] interfaces = clazz1.getInterfaces();
        for (Class i :interfaces){
            System.out.println("Interface: " + i.getName());
        }
    }
}
