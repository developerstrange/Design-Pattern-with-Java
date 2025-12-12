package observerDesignPattern;

public class Ahan_Rob implements Observer{
	
	private String name;
	
	public Ahan_Rob(String name) {
		this.name=name;
	}

	@Override
	public void update(String postUpdate) {
		System.out.println(name+", Instagram updated the latest post,"+postUpdate);
		
	}

}
