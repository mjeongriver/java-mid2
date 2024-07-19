package collection.list.test.ex2;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("양파", 1000, 3);

        cart.add(item1);
        cart.add(item2);

        cart.displayItem();

    }
}
