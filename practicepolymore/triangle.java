package practicepolymore;

public class triangle extends shape{
	int base;
	int hight;
	
		
		
	@Override
	public double area2() {
		// TODO Auto-generated method stub
		return base*hight;
	}
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public triangle(String color, int borderWidth, int base, int hight) {
		super(color, borderWidth);
		this.base = base;
		this.hight = hight;
	}
	
	}
	


