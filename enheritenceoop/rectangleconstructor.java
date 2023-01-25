package enheritenceoop;

public class rectangleconstructor extends shapeconstruct {
	int length;
	int width;
	
	public rectangleconstructor(int length, int width,String color, int borderWidth) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	

}
