package strategyDecorator;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Pagamento de R$" + amount + " realizado com dinheiro");
    }
}

