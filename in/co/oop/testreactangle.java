package in.co.oop;

public class testreactangle {
	
	public static void main(String[] args) {
		rectangle r = new rectangle();
		
		r.setLength(10);
		r.setWidth(20);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		System.out.println(r.getLength()*r.getWidth());
		
		
	}

}
