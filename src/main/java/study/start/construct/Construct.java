package main.java.study.start.construct;

public class Construct {

    public static void main(String[] args) {

        Member obj = new Member("철수", 15, 90);

        Member[] members = new Member[]{
                new Member("영희", 18, 80),
                new Member("지원", 27, 50),
                new Member("헤원", 30, 100)
        };

        for (Member member : members) {
            System.out.println("이름과 성적은? " + member.name + ", " + member.grade);
        }

        /*
        Problem1
         */

        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }

    public static class Book {
        String title;
        String author;
        int page;

        Book() {
            this("", "", 0);
        }

        Book(String title, String author) {
            this(title, author, 0);
        }

        Book(String title, String author, int page) {
            this.title = title;
            this.author = author;
            this.page = page;
        }

        public void displayInfo() {
            System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.page);
        }
    }

    public static class Member {

        String name;
        int age;
        int grade;

        Member(String name, int age, int grade) {
            System.out.println("생성자 호출 this = " + this);

            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }
}
