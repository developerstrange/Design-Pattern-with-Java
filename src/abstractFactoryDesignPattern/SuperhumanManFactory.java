package abstractFactoryDesignPattern;

public class SuperhumanManFactory extends AbstractFactoryOfSuperfools{

	@Override
	SuperhumanMan getMan(String name) {
		if(name == null) {
			return null;
		}
		if(name.equalsIgnoreCase("RedUnderware") || name.equalsIgnoreCase("Superman")) {
			return new SuperMan();
		}else if(name.equalsIgnoreCase("BlackUnderware") || name.equalsIgnoreCase("Batman")) {
			return new Batman();
		}else {
			System.out.println("This super fool is not in this factory!");
			return null;
		}
	}

	@Override
	SuperhumanWomen getWomen(String name) {
		return null;
	}

}
