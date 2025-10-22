package builderDesingPattern;

public class PhoneBuilder {
	private String OS;
	private int battery;
	private int ram;
	private String processor;
	private int camera;
	
	public PhoneBuilder setOS(String OS) {
		this.OS = OS;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(OS,battery,ram, processor, camera);
	}
	
}
