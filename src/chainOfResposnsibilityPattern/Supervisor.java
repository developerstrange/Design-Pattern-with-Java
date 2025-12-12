package chainOfResposnsibilityPattern;

public  class Supervisor implements LeaveHandler{
	
	protected LeaveHandler next;
	
	public void setNext(LeaveHandler next) {
		this.next=next;
	}
	
	public void handle(int days) {
		if(days<=3) {
			System.out.println("Your request for "+days+" leave have been approved by Sueprvisor");
		}else {
			next.handle(days);
		}
	}

}
