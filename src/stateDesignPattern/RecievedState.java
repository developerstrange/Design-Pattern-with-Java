package stateDesignPattern;

public class RecievedState implements MessageState{

	@Override
	public void send(Context context) {
		System.out.println("Message already sent.");
		
	}

	@Override
	public void recieved(Context context) {
		System.out.println("Message just recieved!");
		
	}

	@Override
	public String getStatus() {
		return "Recieved!";
	}

}
