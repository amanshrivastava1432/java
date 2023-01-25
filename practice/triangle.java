package practice;

public class triangle extends shape{
	int base;
	int hight;
	public void area() {
		System.out.println(base*hight);
	}
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	public triangle(String color, int borederwidth, int base, int hight) {
		super(color, borederwidth);
		this.base = base;
		this.hight = hight;
	}
	
	}
	


