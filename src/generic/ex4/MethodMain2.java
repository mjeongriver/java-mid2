package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);
        
        //매개변수 추론
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog, targetDog); //뒤에 cat으로 하면 매개변수 추론이 안됨
        System.out.println("bigger = " + bigger);
    }
}
