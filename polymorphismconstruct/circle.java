package polymorphismconstruct;

public class circle extends shape {
	int radius;

	public int getRadius() {
		return radius;
	}

	public circle(String color, int borderWidth, int radius) {
		super(color, borderWidth);
		this.radius = radius;
	}

	@Override
	public double area1() {
		
		return 3.14*radius*radius;
		
	}

	
	}
	


