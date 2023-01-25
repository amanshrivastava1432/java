package polymorphismconstruct;



public class testclass {
	public static void main(String[] args) {
		
	rectangle r = new rectangle("pink", 5, 5, 5);
	r.getColor();
	r.getLength();
	r.getBorderWidth();
	r.getWidth();
	System.out.println(r.area());
	System.out.println(r.color);
	System.out.println(r.length);
	System.out.println(r.borderWidth);
	System.out.println(r.width);
	
	circle c = new circle("red", 25, 20);
	System.out.println(c.area1());
	
	triangle t= new triangle(20, 20, "blue", 20);
	System.out.println(t.area2());
	

}
}