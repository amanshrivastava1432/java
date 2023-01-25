package in.co.oop;

public class testaccount {
public static void main(String[] args) {
	account a= new account();
	a.setNumber("12345678");
	a.setAccounType("internationalaccount");
	
	
	System.out.println(a.getBalance());
	System.out.println(a.diposite(1000));
	System.out.println(a.diposite(2000));
	System.out.println(a.diposite(-100));

	
	
	
	
	
	
}
}
