package practice;

public class cicletest {
	public static void main(String[] args) {
		
		circle c= new circle(5, 50);
		c.getHeight();
		c.getRadius();
		
		System.out.println(3.14*c.getRadius()*c.getRadius()*c.getHeight());
	}

}
