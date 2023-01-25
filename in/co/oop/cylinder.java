package in.co.oop;

public class cylinder {

	private int radius;
	private int height;
	private int pai;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPai() {
		return pai;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}
	public double area() {
		return 22/7*radius*radius*height;
		
	}

}
