package main.java.study.mid1.string.test;

public class TestString {

    public static void main(String[] args) {

        String url = "https://www.example.com";
        System.out.println("url startWith https://: " + url.startsWith("https://"));
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int lengthSum = 0;
        for (String str : arr) {
            lengthSum += str.length();
        }
        System.out.println("문자열 길이의 합: " + lengthSum);

        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("index = " + index);

        String filename = str.substring(0, index);
        String extName = str.substring(index);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

        str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;
        while (str.contains(key)) {
            int idx = str.indexOf(key);
            count++;
            str = str.substring(idx + 1);
        }
        System.out.println("count = " + count);

        String original = "              Hello Java          ";
        String trimmed = original.trim();
        System.out.println(trimmed);

        String input = "hello java spring jpa java";
        String output = input.replace("java", "jvm");
        System.out.println("output = " + output);

        String email = "hello@example.com";
        String ID = email.split("@")[0];
        String Domain = email.split("@")[1];
        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);

        String fruits = "apple,banana,mango";
        String[] group = fruits.split(",");
        for (String fruit : group) {
            System.out.println(fruit);
        }
        String joinedString = String.join("->", group);
        System.out.println("joinedString = " + joinedString);

        str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
