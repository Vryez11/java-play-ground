package main.java.study.mid1.immutable.test;

public class MyData {

    private final int year;
    private final int month;
    private final int day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyData setYear(int year) {
        return new MyData(year, this.month, this.day);
    }

    public MyData setMonth(int month) {
        return new MyData(this.year, month, this.day);
    }

    public MyData setDay(int day) {
        return new MyData(this.year, this.month, day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}
