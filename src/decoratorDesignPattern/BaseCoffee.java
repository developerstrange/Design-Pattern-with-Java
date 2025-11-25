package decoratorDesignPattern;

public class BaseCoffee implements Coffee{

	@Override
	public double cost() {
		
		return 20;
	}

	@Override
	public String name() {
		
		return "Normal Coffee";
	}

}
