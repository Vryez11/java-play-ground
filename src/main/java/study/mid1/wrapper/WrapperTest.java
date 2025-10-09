package main.java.study.mid1.wrapper;

public class WrapperTest {

    public static void main(String[] args) {

        String str1 = "10";
        String str2 = "20";

        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("sum = " + sum);

        String[] arr = {"1.5", "2.5", "3.0"};
        double doubleSum = 0;
        for (String str : arr) {
            doubleSum += Double.parseDouble(str);
        }
        System.out.println("doubleSum = " + doubleSum);

        String str = "100";
        Integer integer = Integer.valueOf(str);
        int myInt = integer.intValue();
        integer = Integer.valueOf(myInt);
        System.out.println("integer = " + integer);
        System.out.println("myInt = " + myInt);
        System.out.println("integer = " + integer);

        integer = Integer.parseInt(str);
        myInt = integer;
        integer = myInt;
    }
}
