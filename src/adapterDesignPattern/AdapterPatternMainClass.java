package adapterDesignPattern;

public class AdapterPatternMainClass {

	public static void main(String[] args) {
		
		
		
		/*
		The Adapter Pattern is a structural design pattern. Its main purpose is to allow incompatible interfaces to work together. 
		Think of it as a bridge between two classes.
		
		Key Components:
		Target – The interface your client expects to work with.
		Adaptee – The existing class with an incompatible interface.
		Adapter – Converts the Adaptee’s interface into the Target interface.
		
		Steps to achieve adapter pattern:
		1.Identify the Target Interface
			-to which client want to interact with
		2.Identify the Adaptee
			-Identify the existing class with a method that does not match the Target interface
		3.Create the Adapter Class
			-The adapter should implement the Target interface.
			-Inside the adapter, create an instance of the Adaptee.
			-In the Target method(s), delegate the call to the Adaptee’s method(s).
		4.Modify the Client to Use the Target Interface
			-implement the target interface
			-The client interacts only with the Target interface.
			-When a new type is needed, create the corresponding adapter instead of modifying the client.
		5.Test the Implementation
			-create the main class
			-Verify that all supported types work via the adapters.
		
			
			
		*/
			
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "song1.mp3");
		player.play("vlc", "video2.mp4");
		player.play("abc", "picture.png");
		
		
		
		
			
			
			
			
			
	}

}
