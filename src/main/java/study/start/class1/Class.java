package main.java.study.start.class1;

public class Class {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
        }

        /*
        Problem 1
         */
        MovieReviewMain.main(new String[]{});

        System.out.println("--------------------");

        /*
        Problem 2
         */
        ProductOrderMain.main(new String[]{});
    }

    public static class MovieReview {
        String title;
        String review;
    }

    public static class MovieReviewMain {

        public static void main(String[] args) {

            MovieReview review = new MovieReview();
            review.title = "타이타닉";
            review.review = "정말 감동적이에요.";

            System.out.println("영화 제목: " + review.title + ", 영화 리뷰: " + review.review);
        }
    }

    public static class ProductOrder {

        String productName;
        int price;
        int quantity;
    }

    public static class ProductOrderMain {

        public static void main(String[] args) {

            /*
            여러 상품의 주문 정보를 담는 배열 생성
            상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
            상품 주문 정보와 최종 금액 출력
             */

            ProductOrder[] orders = new ProductOrder[]{new ProductOrder(), new ProductOrder(), new ProductOrder()};
            orders[0].productName = "두부"; orders[0].price = 2000; orders[0].quantity = 2;
            orders[1].productName = "김치"; orders[1].price = 5000; orders[1].quantity = 1;
            orders[2].productName = "콜라"; orders[2].price = 1500; orders[2].quantity = 2;

            int amount = 0;
            for (ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
                amount += order.price * order.quantity;
            }
            System.out.println("총 결제 금액: " + amount);
        }
    }
}
