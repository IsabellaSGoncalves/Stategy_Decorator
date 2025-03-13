package strategyDecorator;

public class Order {
    private Item item;
    private PaymentStrategy paymentStrategy;

    public Order(Item item){
        this.item = item;
    }

    public void setPaymentStrategy (PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processOrder(){
        System.out.println("Pedido" + item.getDescription());
        System.out.println("Total: R$" + item.getPrice());
        paymentStrategy.pay(item.getPrice());
    }
}
