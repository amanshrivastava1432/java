package BASIC;

public class args {
public static void main(String[] args) {
	

if(args.length==1){
System.out.println("hello"+args[0]);
}
else {
System.out.println("arg name is required");
for (int i=0;i<args.length;i++) {
System.out.println(args[i]);
}
}
}
}