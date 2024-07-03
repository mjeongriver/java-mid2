package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        //마지막에 추가 //0(1)
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1);
        list.add(2);
        System.out.println(list);

        //원하는 위치에 추가
        //마지막에 추가하거나 삭제 하면 O(1)이지만 앞이나 중간에 추가 또는 삭제 할 때는 O(n)이 되는 특징이 있음
        System.out.println("addList");
        list.add(3, "addList"); //O(1);
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); //O(n) -> 넣으면 오른쪽으로 밀어야 함
        System.out.println(list);

        //삭제
        Object removed1 = list.remove(4); //remove Last O(1)
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0); //remove First O(n) -> 왼쪽으로 밀어야 함
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);
    }
}
