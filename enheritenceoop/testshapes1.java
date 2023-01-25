package enheritenceoop;

public class testshapes1 {
	public static void main(String[] args) {
		triangle t= new triangle();
		t.setBase(20);
		t.setHight(25);
		
		System.out.println("area"+t.getBase()*t.getHight());
		System.out.println(t.getBase());
		System.out.println(t.getHight());
	}

}
