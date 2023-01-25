package polymorephism;

public class overloading {
	public static void main(String[] args) {
		add(25,55);
		add(85,"aman");
		add("ishika","shrivastava");
	}

	private static void add(String string, String string2) {
		System.out.println(string+string2);
		
	}

	private static void add(int i, String string) {
	System.out.println(i+string);
		
	}

	private static void add(int i, int j) {
		System.out.println(i+j);
		
	}

}
