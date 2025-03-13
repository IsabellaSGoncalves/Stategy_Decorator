package strategyDecorator;

public class SprinklesTopping extends ItemDecorator{
    public SprinklesTopping(Item decoratedItem){
        super(decoratedItem);
    }

    @Override
    public String getDescription(){
        return decoratedItem.getDescription() + "com cobertura de granulado";
    }
    @Override
    public double getPrice(){
        return decoratedItem.getPrice() + 1.00;
    }
}
