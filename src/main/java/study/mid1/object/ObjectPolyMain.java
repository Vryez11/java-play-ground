package main.java.study.mid1.object;

public class ObjectPolyMain {

    public static void main(String[] args) {

        Car car = new Car();
        Dog dog = new Dog();
        Object obj = new Object();

        action(car);
        action(dog);

        Object[] objects = {dog, car, obj};

        size(objects);

        System.out.println(car.toString());
        System.out.println(car);

        System.out.println(dog);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수: " + objects.length);
    }

    private static void action(Object obj) {
        /*
        obj.sound(), obj.move() 모두 컴파일 오류를 발생하는데 그 이유는 Object 클래스에는 각각의 메서드가 없기 때문이다.
         */

        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
