package enheritenceoop;

public class testshapes {
	public static void main(String[] args) {
		rectangle r =new rectangle();
		r.setBorderWidth(78);
		r.setColor("red");
		r.setLength(25);
		r.setWidth(25);
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getLength()*r.getWidth());
	}

}
