package collection.deque.test.stack;

import collection.deque.DequeMain;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("네이버");
        stack.push("다음");
        stack.push("구글");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
