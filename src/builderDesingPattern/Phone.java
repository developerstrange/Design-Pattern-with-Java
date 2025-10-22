package builderDesingPattern;

public class Phone {
	private String OS;
	private int battery;
	private int ram;
	private String processor;
	private int camera;
	
	public Phone(String OS, int battery, int ram, String processor, int camera) {
		this.OS=OS;
		this.processor=processor;
		this.battery=battery;
		this.camera=camera;
		this.ram=ram;
	}


	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", battery=" + battery + ", ram=" + ram + ", processor=" + processor + ", camera="
				+ camera + "]";
	}
	
	
}
