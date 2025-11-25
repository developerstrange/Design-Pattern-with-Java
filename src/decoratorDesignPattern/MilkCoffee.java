package decoratorDesignPattern;

public class MilkCoffee extends CoffeeDecorator{

	public MilkCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double cost() {
		
		return decoratedCoffee.cost()+20;
	}

	@Override
	public String name() {
		
		return "Milk Coffee";
	}

}
