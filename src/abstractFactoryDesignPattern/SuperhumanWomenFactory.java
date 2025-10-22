package abstractFactoryDesignPattern;

public class SuperhumanWomenFactory extends AbstractFactoryOfSuperfools{

	@Override
	SuperhumanMan getMan(String name) {
		return null;
	}

	@Override
	SuperhumanWomen getWomen(String name) {
		if(name == null) {
			return null;
		}
		if(name.equalsIgnoreCase("Redhair") || name.equalsIgnoreCase("Wanda")) {
			return new ScarletWitch();
		}else if(name.equalsIgnoreCase("Whitehair") || name.equalsIgnoreCase("captainMarvel")) {
			return new CaptainMarvel();
		}else {
			System.out.println("This super fool is not in this factory!");
			return null;
		}

	}

}
