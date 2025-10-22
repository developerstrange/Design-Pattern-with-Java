package prototypeDesignPattern;

public class Shape implements Cloneable{

	private String type;
	private int width;
	private int height;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", width=" + width + ", height=" + height + "]";
	}
	
	//Shallow cloning
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
	//Deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Shape shape = new Shape();
		shape.setHeight(getHeight());
		shape.setWidth(getWidth());
		return shape;
	}
	
}
