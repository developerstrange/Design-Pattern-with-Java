package proxyDesignPattern;

public class ProxyPatternMainClass {

	public static void main(String[] args) {
		
		/*
		
		The Proxy Pattern provides a placeholder or representative object that controls access to another object (called the Real Subject).
		You don’t talk directly to the actual object; instead, you talk to a Proxy, which decides how and when to forward your request.
		
		
		Real Life analogy:
			-Imagine a celebrity.

			-we cannot talk to the celebrity directly.
			-we talk to their Manager/Agent.

			1.The celebrity = Real Subject
			2.The manager = Proxy
			3.You = Client
			
		Components:
			1. Subject (Interface)-	Common interface for RealSubject and Proxy
			2. RealSubject-The real object that does actual work
			3. Proxy-Controls access to RealSubject
			4. Client-Uses Subject, but usually interacts with Proxy
			
		Steps to implement Proxy Design Pattern:-
			1.Create Subject interface
			  -Represents common operations.
			2.Create RealSubject
			  -The actual object with real logic.
			3.Create Proxy
			  -holds reference of real object
			  -implements subject interface
			  -decides when to create object of real subject
			  -whether to allow access etc.
			4.Client interacts with the proxy
			  -client only use proxy object
			
			  
		*/
		
		Video video = new VideoProxy("Fight Club");
		System.out.println("First stream: ");
		video.load();
		
		System.out.println("Second stream: ");
		video.load();

	}

}
