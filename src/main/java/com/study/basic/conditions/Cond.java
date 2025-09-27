package main.java.com.study.basic.conditions;

public class Cond {

    public static void main(String[] args) {

        int age = 27;

        /*
        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
         */

        if (age >= 18) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        /*
        int grade = 1;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
         */

        // 자바 14에 도입된 향상된 switch 문

        int grade = 3;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("coupon = " + coupon);

        // 삼항 연산자
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println(status + "입니다.");
    }
}
