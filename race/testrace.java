package race;

public class testrace {
public static void main(String[] args) {
	raceconditionthread t1=new raceconditionthread("aman");
	raceconditionthread t2=new raceconditionthread ("sumit");
	
	t1.start();
	t2.start();
	
}
}
