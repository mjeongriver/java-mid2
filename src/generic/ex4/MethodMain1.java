package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer intergerValue = GenericMethod.<Integer>numberMethod(30);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        //타입 추론 가능
        Integer result2 = GenericMethod.genericMethod(i);
        Integer intergerValue2 = GenericMethod.numberMethod(30);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
