package comprableandcomperator;

import java.util.ArrayList;
import java.util.Collections;

public class testmarksheet {
	public static void main(String[] args) {
		
		ArrayList m= new ArrayList();
		
		m.add(new marksheet("a4", "aman", "shrivastava", 82));
		m.add(new marksheet("b4", "rohan", "raju", 55));
		m.add(new marksheet("c4", "aman", "shriv",45));
		
	m.add(new marksheet("a4", "aman", "shalesh",95));
	
//	Collections.sort(m, new orderbycondition());
	Collections.sort(m, new orderbycondition());
	for (Object o : m) {
	System.out.println(o);	
	}
	
	}
}
