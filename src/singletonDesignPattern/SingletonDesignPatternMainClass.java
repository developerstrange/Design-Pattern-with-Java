package singletonDesignPattern;

public class SingletonDesignPatternMainClass {

	/*
	  Definition:-
	  The Singleton Design Pattern is a creational design pattern.The
	  Singleton Design Pattern ensures that only one object (instance) of a class
	  is created during the entire program’s lifecycle — and provides a global
	  access point to that instance.
	  
	  Real-life analogy:- 
	  Think of a Government or President’s Office — there’s
	  only one president in a country. If you need to talk to the president, you
	  don’t create a “new” president — you get access to the same existing one.
	  
	  Similarly, in software: 
	  You don’t create multiple instances. 
	  You just get the single shared instance whenever needed.
	  
	  Steps for implementing Singleton Design Pattern:-
	  Step-01:
	  Make the constructor private of the singleton class.
		→ Prevents creating objects using new.
	  Step-02:
	  Create a private static variable of the same class
		→ Holds the single instance.
	  Step-03:
	  Provide a public static method (getInstance())
		→ Returns the instance. If it doesn’t exist yet, create it.
	 */
	public static void main(String[] args) {
		President president1 = President.getObject();
		President president2 = President.getObject();
		
		if(president1 == president2) {
			System.out.println("This is the same president again:))!!");
		}else {
			System.out.println("Welcome to our new president!!");
		}
		
		president1.showPresident();
		president2.showPresident();
	}

}
