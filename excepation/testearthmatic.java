package excepation;

public class testearthmatic {
	public static void main(String[] args) {
		int k = 0;
		int i = 15;
		try {
			double div = i / k;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.err.println("division is not possible to zero");

		}finally {
			System.out.println("Hi My name is Aman");
		}
	}

}
