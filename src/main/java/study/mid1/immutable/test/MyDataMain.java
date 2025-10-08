package main.java.study.mid1.immutable.test;

public class MyDataMain {

    public static void main(String[] args) {

        MyData data1 = new MyData(2024, 1, 1);
        MyData data2 = data1;
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        System.out.println("2025 -> date1");
        data1 = data1.setYear(2025);
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }
}
