package practicepolymore;



public class testclass {

	public static void main(String[] args) {
		
		rectangle r= new rectangle("blue", 55, 25, 35);
		
		System.out.println(r.area());
		
		circle c=new circle("black", 25, 45);
	
		System.out.println(c.area1());
		
		triangle t= new triangle("white", 45, 85, 90);
		System.out.println(t.area2());
		
		
		

	
	}
}
