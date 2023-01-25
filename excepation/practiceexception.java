package excepation;

public class practiceexception {
	public static void main(String[] args) {
		String s = "aman";
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(8));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string abhi choti hai");

			System.exit(0);
		} finally {
			System.out.println("always execute");
		}

	}
}