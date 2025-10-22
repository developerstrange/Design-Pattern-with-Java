package factoryDesignPattern;

public class SmartPhoneFactory {
	public SmartPhone getPhone(String brand) {
		if(brand.equalsIgnoreCase(null)) {
			return null;
		}
		if(brand.equalsIgnoreCase("Samsung")) {
			return new Samsung();
		}else if(brand.equalsIgnoreCase("Apple")) {
			return new Iphone();
		}else if(brand.equalsIgnoreCase("Google")) {
			return new Google();
		}else {
			return null;
		}
		
	}
}
