package main.java.study.mid2.generic;

public class MethodMain {

    public static void main(String[] args) {

        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        Integer integerResult1 = GenericMethod.genericMethod(i);
        Integer integerResult2 = GenericMethod.genericMethod(10);
        Long longResult = GenericMethod.numberMethod(20L);

        Integer count = GenericMethod.genericMethod(5);
    }
}
