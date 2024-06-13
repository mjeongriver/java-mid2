package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 10);
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog myDog = dogBox.get();
        System.out.println("myDog = " + myDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat myCat = catBox.get();
        System.out.println("myCat = " + myCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal myAnimal = animalBox.get();
        System.out.println("myAnimal = " + myAnimal);
    }
}
