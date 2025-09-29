package main.java.com.study.basic.method;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        boolean res = odd(2);
        System.out.println("res = " + res);

        // problem - 은행 계좌 입출금
        Scanner input = new Scanner(System.in);

        int account = 0;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택: ");
            int menu = input.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    int money = input.nextInt();
                    account = deposit(account, money);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요: ");
                    int discount = input.nextInt();
                    account = withdraw(account, discount);
                    break;
                case 3:
                    displayAccount(account);
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int account, int money) {
        System.out.println(money + "원을 입금하였습니다.");
        return account + money;
    }

    public static int withdraw(int account, int discount) {
        if (account - discount < 0) {
            System.out.println(discount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return account;
        }

        System.out.println(discount + "원을 출금하였습니다. 현재 잔액: " + (account - discount));
        return account - discount;
    }

    public static void displayAccount(int account) {
        System.out.println("현재 잔액: " + account);
    }

    public static void exit() {
        System.out.println("시스템을 종료합니다.");
    }

    public static boolean odd(int num) {
        return num % 2 == 1;
    }
}
