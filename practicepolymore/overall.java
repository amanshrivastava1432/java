package practicepolymore;

import polymorephism.reactangle;

public class overall {
	public static void main(String[] args) {
		
		shape s[]=new shape [3];
		s[0]=new rectangle("blue", 20,25,20);
		s[1]= new circle("white",25,50);
		s[2]=new triangle("red", 50,40,25);
		int num =1;
		double totalarea=0;
		if(num == 0) {
			System.out.println(s[0].area());
		}
		if (num==1) {
			System.out.println(s[1].area1());
		}
		if(num==2) {
			System.out.println(s[2].area2());
		}
	}

}
