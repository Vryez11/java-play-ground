package main.java.study.mid2.generic.ex;

import main.java.study.mid2.generic.animal.Animal;
import main.java.study.mid2.generic.animal.Cat;
import main.java.study.mid2.generic.animal.Dog;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        Animal[] animals = new Animal[3];

        Box<Animal>[] animalBoxes = new Box[3];

        animalBoxes[0] = animalBox;
        animalBoxes[1] = new Box<>();
        animalBoxes[1].set(dog);
        animalBoxes[2] = new Box<>();
        animalBoxes[2].set(cat);

        for (Box<Animal> box : animalBoxes) {
            System.out.println(box.get());
        }
    }
}
