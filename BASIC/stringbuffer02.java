package BASIC;

public class stringbuffer02 {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("rashmi");
		StringBuffer m = new StringBuffer("raju");

		System.out.println(s.append(m));
		System.out.println(s.length());
		//System.out.println(s.replace("s","i"));
		System.out.println(s.capacity());
	}

}
