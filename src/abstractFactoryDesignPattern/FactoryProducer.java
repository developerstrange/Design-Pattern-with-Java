package abstractFactoryDesignPattern;

public class FactoryProducer {
	public static AbstractFactoryOfSuperfools createFactory(String factory) {
		if(factory == null) {
			return null;
		}
		if(factory.equalsIgnoreCase("Man")) {
			return new SuperhumanManFactory();					
		}else if(factory.equalsIgnoreCase("Women")) {
			return new SuperhumanWomenFactory();
		}
		return null;
	}
}
