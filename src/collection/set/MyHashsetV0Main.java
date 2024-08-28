package collection.set;

public class MyHashsetV0Main {

    public static void main(String[] args) {
        MyHashsetV0 set = new MyHashsetV0();
        set.add(1); //초기 호출에서는 배열의 요소가 없고 배열의 인덱스에 접근하여 값을 할당하는 작업이므로 O(1)의 시간이 걸림
        set.add(2); //O(n)
        set.add(3); //O(n)
        set.add(4); //O(n)
        set.add(5); //O(n)
        System.out.println(set);

        boolean result = set.add(4); //중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); //O(n)
        System.out.println("set.contains(99) = " + set.contains(99)); //O(n)
    }
}
