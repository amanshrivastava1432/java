package polymorphismconstruct;

public class triangle extends shape{
	public triangle(int base, int hight,String color, int borderWidth) {
		super(color,borderWidth);
		this.base = base;
		this.hight = hight;
	}
	@Override
	public double area2() {
		
		return base*hight;
		
	}
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	int base;
	int hight;
	
	}
	


