package thread;

public class testhellothread {
	public static void main(String[] args) {
		
		hellonothread t1= new hellonothread("aman");
		hellonothread t2=new hellonothread("shrivastava");
		
		t1.run();
		t2.run();
		for(int i=0;i<50;i++) {
			System.out.println("main");
		
		
		}				
	}

}
