package stateDesignPattern;

public class Context {
	private MessageState state;
	private String content;
	
	public Context(String content) {
		this.content=content;
		this.state = new TypingState();
	}
	
	public void setState(MessageState newState) {
		this.state=newState;
	}
	
	public MessageState getState() {
		return state;
	}
	
	public void performSendAction() {
		this.state.send(this);
	}
	
	public void performRecieveAction() {
		this.state.recieved(this);
	}
	
}
