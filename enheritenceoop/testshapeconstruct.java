package enheritenceoop;

public class testshapeconstruct {
public static void main(String[] args) {
	
	rectangleconstructor r = new rectangleconstructor(10, 20, "red",55);
	r.getBorderWidth();
	r.getColor();
	r.getLength();
	r.getWidth();
	System.out.println(r.getBorderWidth());
	System.out.println(r.getColor());
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
}
}
