package main.java.study.start.poly.ex;

public class AnimalPolyMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    /*
    이 코드의 핵심은 Animal animal 부분이다.

    - 다형적 참조 덕분에 animal 변수는 자식인 Dog, Cat, Cow의 인스턴스를 참조할 수 있다.
    - 메서드 오버라이딩 덕분에 animal.sound()를 호출해도 Dog.sound(), Cat.sound(), Cow.sound()와 같이 각 인스턴스의 메서드를 호출할 수 있다.
     */
}
