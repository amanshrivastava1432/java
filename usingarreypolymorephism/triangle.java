package usingarreypolymorephism;

public class triangle extends shape {
	int base;
	int hight;
	public triangle(int base, int hight) {
		super();
		this.base = base;
		this.hight = hight;
	}
	public double area() {
		double tarea=(base*hight);
		System.out.println("triangle_area="+tarea);
		return tarea;
		
		
	}
	

}
