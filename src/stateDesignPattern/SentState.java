package stateDesignPattern;

public class SentState implements MessageState{

	@Override
	public void send(Context context) {
		System.out.println("Message is sent.");
		
	}

	@Override
	public void recieved(Context context) {
		System.out.println("Sending message.....");
		context.setState(new RecievedState());
		
	}

	@Override
	public String getStatus() {	
		return "Sent!";
	}

}
