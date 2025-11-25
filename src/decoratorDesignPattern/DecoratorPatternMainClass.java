package decoratorDesignPattern;

public class DecoratorPatternMainClass {

	public static void main(String[] args) {
		
		Coffee coffee1 = new BaseCoffee();
		System.out.println(coffee1.name()+" is cost of Taka: "+coffee1.cost());
		
		coffee1 = new MilkCoffee(coffee1);
		System.out.println(coffee1.name()+" is cost of Taka: "+coffee1.cost());
		
		Coffee coffee2 = new CreamCoffee(new BaseCoffee());
		System.out.println(coffee2.name()+"  is cost of Taka: "+coffee2.cost());

	}

}
