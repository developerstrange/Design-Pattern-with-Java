package abstractFactoryDesignPattern;
import java.util.Scanner;

public class AbstractFactoryMainClass {
	/*
	 
	 Definition:-
	 The Abstract Factory Design Pattern is a creational pattern that
	 provides an interface to create families of related objects without
	 specifying their concrete classes.
	 Actually this design pattern creates object of factory of object, where those factory actually then creates object.
	 The factory that creates factory don't even know which object he is creating. He knows only he is creating a factory where many objects creation logic exists.
	 
	 Real-life analogy:-
	 Imagine you’re ordering computer parts 💻.
	 You might have two brands: MSI and Apple.
	 MSI factory produces MSI Monitor, MSI Keyboard.
	 Apple factory produces Apple Monitor, Apple Keyboard.
	 Both factories follow the same product family (monitors & keyboards), but each has its own style.
	 You don’t directly create products;
	 you just ask the abstract factory, and it decides which brand’s factory to use.
	 
	 Steps to implement abstract factory design pattern:-
	 Step-01:
	 Create product interfaces (e.g., Monitor, Keyboard).
	 Step-02:
	 Create concrete products (e.g., MSIMonitor, AppleMonitor, etc.).
	 Step-03:
	 Create an Abstract Factory interface (e.g., ComputerFactory) that declares creation methods for each product.
	 Step-04:
	 Create Concrete Factories that implement the abstract factory (e.g., MSIFactory, AppleFactory).
	 Step-05:
	 Use a Factory Producer (optional) to get the desired factory.
	 Step-06:
	 In client code, use the factory to create product families. 
	 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f_name;
		System.out.println("Hi there,\nDo u want man superhero or women superhero?");
		f_name = sc.nextLine();
		if(f_name.equalsIgnoreCase("Man")) {
			AbstractFactoryOfSuperfools sFactory = FactoryProducer.createFactory("Man");
			String s_name;
			System.out.println("Do u want Superman of Batman?");
			s_name = sc.nextLine();
			if(s_name.equalsIgnoreCase("Superman")) {
				SuperhumanMan s_obj = sFactory.getMan("Superman");
				s_obj.showPower();
			}else if(s_name.equalsIgnoreCase("Batman")) {
				SuperhumanMan s_obj1 = sFactory.getMan("Batman");
				s_obj1.showPower();
			}else {
				System.out.println("U didn't told what u want!");
			}
		}else if(f_name.equalsIgnoreCase("Women")) {
			AbstractFactoryOfSuperfools sFactory = FactoryProducer.createFactory("Women");
			String s_name;
			System.out.println("Do u want Wanda or Captain Marvel?");
			s_name = sc.nextLine();
			if(s_name.equalsIgnoreCase("Wanda")) {
				SuperhumanWomen s_obj = sFactory.getWomen("Wanda");
				s_obj.showPower();
			}else if(s_name.equalsIgnoreCase("Captain marvel")) {
				SuperhumanWomen s_obj1 = sFactory.getWomen("captainMarvel");
				s_obj1.showPower();
			}else {
				System.out.println("U didn't told what u want!");
			}
		}
	}

}
