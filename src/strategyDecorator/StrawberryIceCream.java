package strategyDecorator;

public class StrawberryIceCream implements Item {
    @Override
    public String getDescription(){
        return " Sorvete de morango ";
    }

    @Override
    public double getPrice(){
        return 8.00;
    }

}