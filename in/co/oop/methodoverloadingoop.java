package in.co.oop;

public class methodoverloadingoop {
	

	public static void main(String[] args) {
		add(1,2);
		add(25,"aman");
        add("raman","rajat");
	}

	private static void add(String string, String string2) {
		System.out.println("String" +" String2");
		
	}

	private static void add(int i, String string) {
		System.out.println("int"+"String");
	}

	private static void add(int i, int j) {
		System.out.println("int"+"int");
		
	}

}
