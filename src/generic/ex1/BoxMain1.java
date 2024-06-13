package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {

        //타입 안정성은 높으나 코드 재사용성은 낮음 
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("Hello, World!");
        String str = stringBox.get();
        System.out.println("str = " + str);

    }
}
