package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    //추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if(index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    //추가 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0 ){
            first = removeNode.next;
        } else {
            Node<E> prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    //중첩 클래스는 특정 클래스 안에서만 사용할 때 주로 사용한다.
    //Node 클래스는 MyLinkedListV3 클래스에서만 사용한다.
    //중첩 클래스를 사용하면 MyLinkedListV3 입장에서 외부에 있는 Node 클래스보다 내부에 선언한 Node 클래스를 먼저 사용한다.
    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node x = this; //x01
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }


}
