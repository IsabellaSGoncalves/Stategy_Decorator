package strategyDecorator;

public class TicketPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Pagamento de R$" + amount + " realizado atráves de boleto");
    }
}

