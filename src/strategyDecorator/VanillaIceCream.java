package strategyDecorator;

public class VanillaIceCream implements Item {
    @Override
    public String getDescription(){
        return " Sorvete de baunilha ";
    }

    @Override
    public double getPrice(){
        return 7.00;
    }

}
