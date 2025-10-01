package main.java.study.start.access.b;

import main.java.study.start.access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {

        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지에서 default 호출 불가

        // private 호출 불가

        data.innerAccess();
    }
}
