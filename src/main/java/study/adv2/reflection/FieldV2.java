package main.java.study.adv2.reflection;

import main.java.study.adv2.reflection.data.User;

import java.lang.reflect.Field;

public class FieldV2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        User user = new User("id1", "userA", 20);
        System.out.println("기존 이름 = " + user.getName());

        Class<? extends User> userClass = user.getClass();
        Field name = userClass.getDeclaredField("name");

        // private 필드에 접근 허용, private 메서드도 이렇게 호출 가능
        name.setAccessible(true);
        name.set(user, "userB");
        System.out.println("바뀐 이름 = " + user.getName());
    }
}
