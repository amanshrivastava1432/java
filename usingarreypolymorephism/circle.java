package usingarreypolymorephism;

public class circle extends shape{
	int radius;

	public circle(int radius) {
		super();
		this.radius = radius;
	}
	public double area() {
		double rarea=(3.14*radius*radius);
		System.out.println("circle_area="+rarea);
		return rarea;
		
	}

}
