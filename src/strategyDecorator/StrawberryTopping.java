package strategyDecorator;

public class StrawberryTopping extends ItemDecorator{
    public StrawberryTopping(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription(){
        return decoratedItem.getDescription() + "com cobertura de morango";
    }
    @Override
    public double getPrice(){
        return decoratedItem.getPrice() + 1.50;
    }
}
