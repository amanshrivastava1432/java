package thread;

public class hellonothread1 extends Thread {
String name=null;
  public hellonothread1(String n) {
 
	name =n;
  }
public void start() {
	for(int i=0 ;i<50; i++ ) {
	System.out.println(i+name);
}
}
}
