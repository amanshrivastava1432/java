package enheritenceoop;

import in.co.oop.shapes;

public class rectangle extends shapes {
	int length;
	int width;
	public void area() {
	
	System.out.println(length*width);	
	
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

}
