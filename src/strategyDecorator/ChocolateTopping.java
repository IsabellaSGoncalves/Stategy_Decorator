package strategyDecorator;

public class ChocolateTopping extends ItemDecorator{
    public ChocolateTopping(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription(){
        return decoratedItem.getDescription() + "com cobertura de chocolate";
    }
    @Override
    public double getPrice(){
        return decoratedItem.getPrice() + 2.00;
    }
}
