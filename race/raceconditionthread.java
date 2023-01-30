package race;

public class raceconditionthread {
	
	public static account data = new account();
	
	String name ="aman";
	
	public raceconditionthread(String namer) {
		this.name=name;
	}
	public void start() {
		for(int i=0;i<5;i++) {
			data.deposite(name, 1000);
			
		}
		
		
	}

}
