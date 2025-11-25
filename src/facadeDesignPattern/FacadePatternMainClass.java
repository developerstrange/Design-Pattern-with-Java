package facadeDesignPattern;

public class FacadePatternMainClass {

	public static void main(String[] args) {
		
		/*
		A Facade is a single class that provides a simple interface to a complex subsystem.
		Instead of the client dealing with 5–10 complicated classes, you give them one clean entry point.
		
		Key Components:-
		Facade - The class with whome the client will interact to do a particular task
		Subsystem - The classes which functionality client will try to execute and facade class will do
			
		Steps to achieve Facade Design Pattern:-
		1.Identify subsystem classes
			-These are complex, detailed classes the client normally should not interact with directly.
		2.Create a Facade class
			-will have references of subsystem classes
			-Provides simple methods (high-level API)
			-will call all the methods of the subsystem classes internally.
		3.Client uses only the Facade
			-Client does NOT talk to subsystems anymore.
			
		
		*/
		
		
		HomeTheatreFacade homeTheatre = new HomeTheatreFacade();
		homeTheatre.watchMovie("Inception");
			
			
			
	}

}
