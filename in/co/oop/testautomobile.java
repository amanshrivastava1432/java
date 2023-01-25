package in.co.oop;

public class testautomobile {
	public static void main(String[] args) {
	automobile a=new automobile();
	a.setColor("red");
	a.setMake("platinum body");
	System.out.println(a.getGear(1));
	System.out.println(a.getGear(2));
	System.out.println(a.getGear(-2));
	
	
	}

}
