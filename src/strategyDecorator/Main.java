package strategyDecorator;

public class Main {
    public static void main(String[] args) {
        Item icecream = new StrawberryIceCream();
        icecream = new ChocolateTopping(icecream);

        Order order = new Order(icecream);
        order.setPaymentStrategy(new CashPayment());

        order.processOrder();

    }
}