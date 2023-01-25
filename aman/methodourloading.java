package aman;

public class methodourloading {
	public static void main(String[] args) {
		add(0, 0);
		add(20, "sharma");
		add("ajay", "vinod");

	}

	private static void add(String string, String string2) {
		System.out.println(string + string2);

	}

	public static void add(int i, String string2) {
		System.out.println(i + string2);
	}

	public static char[] additon(String string) {
		System.out.println(string + "int");
		return null;
	}

	public static void add(int b, int j) {

		System.out.println(b - j);

	}

	public char[] add;

}
