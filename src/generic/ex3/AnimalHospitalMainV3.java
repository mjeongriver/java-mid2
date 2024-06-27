package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
      //<Integer> intHospital = new AnimalHospitalV3(); //컴파일 오류

        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        //dogHospital.set(cat); //다른 타입을 입력: 컴파일 오류

        //문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("뭉뭉이", 10));
        System.out.println("biggerDog = " + biggerDog);
    }
}