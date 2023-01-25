package practicepolymore;

public class rectangle extends shape {
	
	int length;
	int width;
	public rectangle(String color, int borderWidth, int length, int width) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
	
		return length*width;
	}
	
	
	
	}
	


