package returntypepolymorephism;

public class triangle extends shape {
	int base;
	int hight;
	public triangle(int base, int hight) {
		super();
		this.base = base;
		this.hight = hight;
	}
	public double tarea() {
		double tarea=base*hight;
		System.out.println(tarea);
		return tarea;
		
	}
	

}
