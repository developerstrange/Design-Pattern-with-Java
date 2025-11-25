package decoratorDesignPattern;

public class CreamCoffee extends CoffeeDecorator{

	public CreamCoffee(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double cost() {
		
		return decoratedCoffee.cost()+30;
	}

	@Override
	public String name() {
		
		return "Cream Coffee";
	}


}
