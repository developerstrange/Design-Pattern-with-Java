package builderDesingPattern;

public class BuilderDesignPatternMainClass {

	/*
	 Definition:-
	 The Builder Design Pattern is a creational design pattern that lets you construct complex objects step by step.
	 It separates the construction process from the representation, so the same construction process can create different forms of an object.
	 It means we can create our custom object by using the same class. The class will be same which will be used to create different objects with different configuration.
	 We can add new feature and remove any feature in our newly build object.
	 
	 
	 Real-life Analogy:-
	 Think of a house construction —
	 You don’t just say “build a house” and it appears.
	 You build it step by step:
	 → first the foundation, then walls, roof, garden, garage, etc.
	 Different customers can ask for different combinations —
	 one may want a simple house, another a luxury house.
 	 The builder follows the same process but customizes the details.
 	 
 	 
 	 Steps for implementing builder design pattern:
 	 Step-01:
 	 Create a Product class (the complex object to build).
 	 Step-02:
 	 Create a Builder class with fields and setter methods for each attribute.
 	 Step-03:
 	 Add a build() method in the builder that returns the final product.
 	 Step-04:
 	 In client code, use the builder to set the parts you want and call build().
 	 
	 */
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setBattery(5200).setOS("IOS").setCamera(52).setProcessor("Snapdragon").setRam(16).getPhone();
		Phone mobile = new PhoneBuilder().setOS("Android").setBattery(4500).setProcessor("Tensor").getPhone();
		System.out.println(phone);
		System.out.println(mobile);
	}

}
