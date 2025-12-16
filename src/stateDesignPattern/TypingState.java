package stateDesignPattern;

public class TypingState implements MessageState{

	@Override
	public void send(Context context) {
		System.out.println("Message is typing.....");
		context.setState(new SentState());
		
	}

	@Override
	public void recieved(Context context) {
		System.out.println("Message is no recieved yet!");
		
	}

	@Override
	public String getStatus() {
		return "Typing!";
	}

}
