package java8feature;
@FunctionalInterface
public interface inter {

	public int add(int a,int b);
	
	public default   void defmethod() {
		System.out.println("i am default mathod");
		
	}
	public static void Static() {
		System.out.println("i am static mathod");
	}

}

