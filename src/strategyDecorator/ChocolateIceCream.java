package strategyDecorator;

public class ChocolateIceCream implements Item {
    @Override
    public String getDescription(){
        return " Sorvete de chocolate ";
    }

    @Override
    public double getPrice(){
        return 10.00;
    }

}
