package main.java.study.adv2.reflection;

import main.java.study.adv2.reflection.data.BasicData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodV2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        BasicData helloInstance = new BasicData();
        helloInstance.call();
        
        // 동적 메소드 호출 - 리플렉션 사용
        Class<? extends BasicData> helloClass = helloInstance.getClass();
        String methodName = "hello";

        // 메서드 이름을 변수로 변경할 수 있다.
        Method declaredMethod = helloClass.getDeclaredMethod(methodName, String.class);
        Object returnValue = declaredMethod.invoke(helloInstance, "hi");
        System.out.println("returnValue = " + returnValue);
    }
}
