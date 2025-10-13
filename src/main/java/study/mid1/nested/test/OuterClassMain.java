package main.java.study.mid1.nested.test;

public class OuterClassMain {

    public static void main(String[] args) {

        OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
        nested.hello();

        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();

        OuterClass3 local = new OuterClass3();
        local.myMethod();

        Hello hello = new Hello() {
            @Override
            public void hello() {

                System.out.println("OuterClassMain.hello");
            }
        };

        hello.hello();
    }
}
