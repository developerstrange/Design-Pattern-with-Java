package chainOfResposnsibilityPattern;

public class CEO extends Supervisor{
	
	protected LeaveHandler next;
	
	public void setNext(LeaveHandler next) {
		this.next=next;
	}
	
	@Override
	public void handle(int days) {
		if(days>6) {
			System.out.println("Your request for "+days+" leave have been approved by CEO");
		}else {
			next.handle(days);
		}
	}
}
