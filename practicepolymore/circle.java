package practicepolymore;

public class circle extends shape{
	
	int radius;

	
		
	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}



	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public circle(String color, int borderWidth, int radius) {
		super(color, borderWidth);
		this.radius = radius;
	}
	
	
	
	}


