package main.java.basic.loops;

public class Loop {

    public static void main(String[] args) {

        /*
        수정할 때 count, 하고 while 조건식을 수정해야 하는데 의미가 명확하지 않음.
        int count = 10;
        int sum = 0;
        while (count <= 13) {
            sum += count++;
        }

        System.out.println("sum = " + sum);
         */

        // 변경 사항이 있을 때 while 조건식, num 만 수정하면 됨
        // 의미가 명확함 count: 실행 카운트, num: 덧셈 시작 정수
        /*
        int count = 1;
        int num = 10;
        int sum = 0;
        while (count++ <= 3) {
            sum += num++;
        }
        System.out.println("sum = " + sum);
         */

        // 변경 사항은 startNum, endNum 뭔가 더 명확한 거 같기도 하고?
        // while 문 스럽다?
        int startNum = 10;
        int endNum = 13;
        int sum = 0;
        while (startNum <= endNum) {
            sum += startNum++;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int i = 10; i <= endNum; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // problem
        // for 문에 , 으로 여러 식 표현 가능
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }

    }
}
