package singletonDesignPattern;

public class President {
	private static President president;
	
	private President() {}
	
//	public static President getObject() {
//		if(president == null) {
//			president = new President();
//		}
//		return president;
//	}
	
	/*In multi-threaded applications, multiple threads might created multiple instances simultaneously.
	  It can be fixed by making the getObject() method synchronized
	*/
	
	//Thread-safe singleton
	public static synchronized President getObject() {
		if(president == null) {
			president = new President();
		}
		return president;
	}
	
	public void showPresident() {
		System.out.println("I am ur previous president. Don't think me that i am new!!");
	}
}
