package main.java.basic.casting;

public class Casting {

    public static void main(String[] args) {

        // 작은 범위에서 큰 범위에 대압하는 것은 자동 형변환이 일어 난다.
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        doubleValue = longValue;

        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 1.5;
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);

        // 계산과 형변환
        int div1 = 3 / 2;
        double div2 = 3 / 2;
        double div3 = 3.0 / 2;
        double div4 = (double) 3 / 2;

        int a = 3, b = 2;
        double res = (double) a / b;
        System.out.println("div1 = " + div1);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);
        System.out.println("div4 = " + div4);
        System.out.println("res = " + res);
    }
}
