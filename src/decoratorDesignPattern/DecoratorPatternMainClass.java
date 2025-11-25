package decoratorDesignPattern;

public class DecoratorPatternMainClass {

	public static void main(String[] args) {
	
		/*
		
		The Decorator Pattern is a structural design pattern that lets you add new behavior to objects dynamically without altering their class.
		
		Real Life analogy:
			Think of a plain coffee. You can add milk, sugar, or whipped cream without creating a new class for every combination. 
			Each addition is a “decorator” wrapped around the original coffee.
		
		Components:
			1.Component (Target) – The interface or abstract class for objects that can have responsibilities added dynamically.
			2.Concrete Component – The original class whose behavior you want to extend.
			3.Decorator – Implements the Component interface and contains a reference to a Component object.
			4.Concrete Decorators – Classes that add new behavior before or after delegating to the Component.
		
		Steps to implement decorator design pattern:
			1.Define the Component interface
			  -Interface or abstract class with methods that clients expect.
			2.Create a Concrete Component
			  -A class implementing the Component, providing basic behavior.
			3.Create an abstract Decorator
			  -Implements Component and contains a reference to a Component object.
			4.Create Concrete Decorators
			  -Extend the abstract decorator and add new behavior.
			5.Use decorators in the client
			  -Wrap objects dynamically as needed:
		
		*/
		
		Coffee coffee1 = new BaseCoffee();
		System.out.println(coffee1.name()+" is cost of Taka: "+coffee1.cost());
		
		coffee1 = new MilkCoffee(coffee1);
		System.out.println(coffee1.name()+" is cost of Taka: "+coffee1.cost());
		
		Coffee coffee2 = new CreamCoffee(new BaseCoffee());
		System.out.println(coffee2.name()+"  is cost of Taka: "+coffee2.cost());

	}

}
