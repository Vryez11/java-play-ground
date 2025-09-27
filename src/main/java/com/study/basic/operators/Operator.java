package main.java.com.study.basic.operators;

public class Operator {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("sum = " + sum);
        System.out.println("dif = " + dif);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);

        // System.out.println(a / 0);

        String result = "hello" + " " + "world";
        System.out.println("result = " + result);

        // 햇갈리기 쉬운 문자열과 숫자 더하기
        String str = "a + b = " + 10;
        System.out.println(str);

        // 증감 연산자 사용 예제
        int prefixA = ++a + 10;
        a--;
        int postFixA = a++ + 10;

        System.out.println("prefixA = " + prefixA);
        System.out.println("postFixA = " + postFixA);

        // boolean res = 10 && "abc";

        /*
        문제 풀이 1번
         */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum1 = num1 + num2 + num3;
        int average = (num1 + num2 + num3) / 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("average = " + average);

        /*
        문제 풀이 3번
         */
        int score = 89;
        boolean booleanRes = score >= 80 && score <= 100;
        System.out.println("booleanRes = " + booleanRes);
    }
}
