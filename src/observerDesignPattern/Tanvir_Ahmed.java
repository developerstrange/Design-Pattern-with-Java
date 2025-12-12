package observerDesignPattern;

public class Tanvir_Ahmed implements Observer{
	private String name;
	public Tanvir_Ahmed(String name) {
		this.name=name;
	}

	@Override
	public void update(String postUpdate) {
		System.out.println(name+" Instagram notified all the user. Do u want to update your follower also with the messeage, "+postUpdate+"?");
		
	}

}
