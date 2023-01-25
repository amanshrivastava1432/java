package practicepolymore;



public class usingarrey {
	public static void main(String[] args) {
		shape[] s= new shape[3];
		s[0]=new practicepolymore.rectangle("blue", 20,25,45);
		s[1]=new practicepolymore.circle("red", 20,25);
		s[2]= new practicepolymore.triangle("white", 25,30,35);
		double totalarea =0;
		
		for(int i=0;i<s.length;i++) {
			totalarea=s[i].area();
			System.out.println(totalarea);
			
			totalarea=s[i].area1();
			System.out.println(totalarea);
			
			
			totalarea=s[i].area2();
			System.out.println(totalarea);
			
		}
				
		
		
		
				
	}
	

}
