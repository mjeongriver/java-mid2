package generic.ex5;

public class EraserBox<T> {
    public boolean instanceCheck(Object param) {
        //instanceof는 항상 Object와 비교하게 된다. 이렇게 되면 항상 참이 반환되는 문제가 발생한다.
        //return param instanceof T;
        return false;
    }

    public void create() {
        //return new T(); //오류
    }
}
