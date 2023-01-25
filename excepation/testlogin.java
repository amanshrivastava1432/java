package excepation;

public class testlogin {
	public static void main(String[] args) {
		String name="admin";
		
		if(name=="admin"){
			System.out.println("valid");
		}else {
			try {
				throw new loginexception();
			}catch(Exception e) {
				System.out.println("hello");
				System.err.println(e.getMessage());
				
			}
		}
	}

}
