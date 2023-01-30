package thread;

public class testhellonothread {
	
	public static void main(String[] args) {
		hellonothread t1 =new hellonothread("simpi");
		hellonothread t2=new hellonothread("shrivastava");
		
		t1.start();
		t2.start();
		for(int i=0;i<50;i++) {
			System.out.println("ram");
			
		}
		
		
		
	}

}
