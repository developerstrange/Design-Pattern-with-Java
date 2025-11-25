package decoratorDesignPattern;

public abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee)
	{
		this.decoratedCoffee = coffee;
	}
	
	@Override
	public double cost() {
		
		return decoratedCoffee.cost();
	}

	@Override
	public String name() {
		
		return decoratedCoffee.name();
	}
}
