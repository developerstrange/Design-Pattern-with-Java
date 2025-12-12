package chainOfResposnsibilityPattern;

public class ChainOfResponsibilityMainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * Definition:- The Chain of Responsibility pattern lets you pass a request
		 * along a chain of handlers, until one handler decides to process it.
		 * 
		 * Instead of one object deciding everything, responsibility is shared across
		 * multiple objects, forming a chain.
		 * 
		 * 
		 * Real-Life analogy:- Imagine you work in an office and you submit a leave
		 * request.
		 * 
		 * Who may approve it?
		 * 
		 * Team Leader → can approve 1–2 days
		 * 
		 * Manager → can approve 3–10 days
		 * 
		 * Director → can approve 11–30 days
		 * 
		 * CEO → approves everything else
		 * 
		 * Your request travels up the chain until someone handles it.
		 * 
		 * This is EXACTLY the Chain of Responsibility pattern.
		 * 
		 * 
		 * Steps to achieve Chain of Responsibility pattern:-
		 * 
		 * Step:01-Create the Base Handler interface/abstract class
		 * -Declares the handleRequest() method
		 * -Holds reference to nextHandler
		 * 
		 * Step:02-Create Concrete Handler classes
		 * -Each class handles part of the request
		 * -If they can’t handle, they forward to next handler
		 * 
		 *  Step:03-Set up the chain in the Client
		 * -Create handler objects
		 * -Connect them using setNextHandler()
		 * 
		 *  Step:04-Send request to the first handler
		 * -First handler either handles or passes to next
		 * -Request travels down chain until handled
		 * 
		 * Step:05-(Optional) Add new handlers anytime
		 * -Does NOT require modifying existing handlers
		 * -Just change the chain setup
		 * 
		 * 
		 */

		Supervisor supervisor = new Supervisor();
		Manager manager = new Manager();
		CEO ceo = new CEO();
		supervisor.setNext(manager);
		manager.setNext(ceo);
		
		supervisor.handle(10);
		supervisor.handle(4);
		
		
		
		
		
	}

}
