package polymorephism;

public class testreactangle {
public static void main(String[] args) {
	
	reactangle r = new reactangle();
	r.setLength(25);
	r.setWidth(25);
	
	System.out.println(r.area());
	
	circle c=new circle();
	c.setRadius(25);
	System.out.println(c.area1());
	
	triangle t = new triangle();
	t.setBase(30);
	t.setHight(25);
	System.out.println(t.area2());
	
	
}
}
