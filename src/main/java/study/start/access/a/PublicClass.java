package main.java.study.start.access.a;

import java.awt.geom.Dimension2D;

public class PublicClass {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

        System.out.println("publicClass = " + publicClass);
        System.out.println("class1 = " + class1);
        System.out.println("class2 = " + class2.getClass());
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
