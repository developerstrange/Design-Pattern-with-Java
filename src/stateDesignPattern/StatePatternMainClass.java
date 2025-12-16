package stateDesignPattern;

public class StatePatternMainClass {
	
	/*
	 
	 Definition:-
	 State Pattern allows an object to change its behavior when its internal state changes, 
	 without using large if–else or switch blocks
	 
	 Real-life analogy:-
	 ATM Machine
	 NoCardState → insert card allowed
	 HasCardState → enter PIN allowed
	 AuthenticatedState → withdraw allowed
 	 ATM object stays same
  	 Behavior changes by state
  	 
  	 
  	 Key Components:
  	 1.Context
  	 	-whose behavior will be changed according to it's state
  	 2.State
  	 	-the behavior of the context (Interface contain all the common action for concrete states)
  	 3.Concrete States
  	 	-Each subclass implements the behavior associated with a specific state of the Context.

	 
	 Steps to implement abstract factory design pattern:-
	 Step-01:
	 Identify the states
	 Step-02:
	 Identify the actions
	 Step-03:
	 Create the State interface(Declare all actions as methods)
	 Step-04:
	 Create Concrete State classes(Implements the State interface,Defines behavior for each action,Changes state when needed)
	 Step-05:
	 Create the Context class(Stores the current state,Delegates actions to the state)
	 Step-06:
	 Delegate behavior to the state
	 Step-07:
	 Handle state transitions inside states[text.setState(new SentState());] 
	 
	 */

	public static void main(String[] args) {
		
		Context message = new Context("Tomorrow we have a party. Be ready before I come to recieve you.");
		System.out.println(message.getState().getStatus());
		message.performSendAction();
		System.out.println(message.getState().getStatus());
		message.performRecieveAction();
		System.out.println(message.getState().getStatus());
		message.performRecieveAction();
		

	}

}
