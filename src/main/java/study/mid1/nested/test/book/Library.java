package main.java.study.mid1.nested.test.book;

public class Library {

    private Book[] books;
    private int count;

    Library(int count) {
        books = new Book[count];
        this.count = 0;
    }

    public void addBook(String title, String author) {
        if (this.count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[count++] = new Book(title, author);
    }

    public void showBooks() {

        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + this.title + ", 저자: " + this.author;
        }
    }
}
