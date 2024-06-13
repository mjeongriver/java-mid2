package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("hello"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello, World!");
        //stringBox.set(10); //String 타입만 허용, 컴파일 오류
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("d = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        //선언부에는 type 정보 있어야 함
        GenericBox<Boolean> booleanBox = new GenericBox<>();
    }
}
