package BASIC;	

public class switchkey {
public static void main(String[]args) {
int a=100;
int b=25;

String s = "+";

switch (s) {

case "+": 
	System.out.println(a+b);
break;

case "-":
	System.out.println(a-b); 
	break;
	
	default:
		System.out.println("koi bhi string pass nhi ki h");
}
}
}
