package chainOfResposnsibilityPattern;

public interface LeaveHandler {
	void setNext(LeaveHandler handler);
	void handle(int days);
}
