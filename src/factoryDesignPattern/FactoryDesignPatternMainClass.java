package factoryDesignPattern;

public class FactoryDesignPatternMainClass {

	/*
	 Definition:- The factory design pattern is a creational design pattern that
	  provides a way to create objects without exposing the creation logic to the
	  client. Instead of the client using "new" keyword to create objects, it asks
	  a factory class to create them. The factory decides which subclass object to
	  return based on the input. It creates objects without exposing the creation
	  logic to the client.
	  
	 Real-life analogy:-
	  Imagine a Car Factory 🚙 — When you order a car, you just
	  say “Give me a Sedan” or “Give me an SUV.” You don’t build it yourself — the
	  factory decides which car model to create and gives it to you.
	  
	  Similarly in programming — You call the factory and it creates the right
	  object for you, based on your request.
	  
	 Steps for implementing Factory Design pattern:-
	  Step-01:
	  Create an interface or abstract class for the common product (e.g., Shape).
	  Step-02:
	  Create concrete classes that implement this interface (e.g., Circle, Rectangle).
	  Step-03:
	  Create a Factory class that has a method to return objects based on input.
	  Step-04:
	  Use the factory in the client code instead of calling new directly.
	 */
	public static void main(String[] args) {
		SmartPhoneFactory phone = new SmartPhoneFactory();
		SmartPhone phone1 = phone.getPhone("Google");
		SmartPhone phone2 = phone.getPhone("Apple");
		phone1.welcome();
		phone2.welcome();
	}

}
