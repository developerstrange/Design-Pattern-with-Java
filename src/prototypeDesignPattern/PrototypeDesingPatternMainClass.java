package prototypeDesignPattern;

public class PrototypeDesingPatternMainClass {

	/*
	 * Definition:- 
	 * The Prototype Design Pattern is a creational pattern that lets
	 * you create new objects by copying (cloning) an existing object (called a
	 * prototype) instead of creating them from scratch. We don't create the same
	 * type of object again and again. Instead of doing this we just clone the
	 * existing object with new modification if needed.
	 * 
	 * Real-life analogy:- 
	 * Imagine you have to prepare multiple ID cards for
	 * employees. Each ID card has the same template — you just change the name and
	 * photo.
	 * Instead of designing a new card every time, you clone the template and modify
	 * the details you need.
	 * That’s exactly what the Prototype pattern does in code.
	 */
	
	//Steps for achieve prototype design pattern
	//Step-1:
	//Create a Prototype (base) class
	//	→ Implement Cloneable interface
	//Step-2:
	//Create Concrete Prototype classes (optional)
	//	→ Subclasses can override the clone() method for custom behavior.
	//Step-3:
	//Create Objects (Prototypes)
	//	→ Make one or more “prototype” objects.
	//Step-4:
	//Clone the Prototype when needed
	//	→ Instead of using new, use clone() to create new objects.
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//First Example
		BookShop bs = new BookShop();
		bs.setShopName("Amar book");
		bs.loadBooks();
		System.out.println(bs);
		
		
		BookShop bs1 = (BookShop)bs.clone();	
		bs1.setShopName("Your book");
		System.out.println(bs1);
		
		System.out.println("----------------------------");
		bs.getBooks().remove(2);
		System.out.println(bs1);
		System.out.println(bs);
		
		
		//Second Example
		Shape rect1 = new Shape();
		rect1.setType("Rectagle");
		rect1.setHeight(40);
		rect1.setWidth(20);
		
		Shape rect2 = (Shape)rect1.clone();
		rect2.setType("Rectagle");
		rect2.setHeight(30);
		rect2.setWidth(15);
		
		System.out.println(rect1);
		System.out.println(rect2);

	}

}
