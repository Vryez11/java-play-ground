package main.java.com.study.basic.array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);

        int[] scores = {90, 80, 70, 60, 50};

        for (int score : scores) {
            //System.out.println("score = " + score);
        }

        // problem
        Scanner input = new Scanner(System.in);

        String[] productNames = new String[3];
        int[] productPrices = new int[3];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = input.nextInt();

            if (menu == 3) break;
            if (menu == 2) {
                for(int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
                continue;
            }

            if (productCount > 2) {
                System.out.println("메뉴가 가득차 더 이상 추가할 수 없습니다.");
                continue;
            }

            System.out.print("상품 이름을 입력하세요: ");
            String productName = input.next();
            System.out.print("상품 가격을 압력하세요: ");
            int productPrice = input.nextInt();

            productNames[productCount] = productName;
            productPrices[productCount++] = productPrice;
        }
    }
}
