package stateDesignPattern;

public interface MessageState {
	void send(Context context);
	void recieved(Context context);
	String getStatus();
}
