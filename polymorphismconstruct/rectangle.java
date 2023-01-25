package polymorphismconstruct;

public class rectangle extends shape {
	public rectangle(String color, int borderWidth, int length, int width) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		
		return length*width;
		
	}
	int length;
	int width;
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	

}
