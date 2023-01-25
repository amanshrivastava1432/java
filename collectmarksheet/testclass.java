package collectmarksheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testclass {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		marksheet m1 =new marksheet("r101", "aman", 100, 45, 95);
		marksheet m2= new marksheet("me121"," sumit", 55, 65, 85);
		
		
		
		
		
	l.add(m1);
	l.add(m2);
	l.remove(m1);
	
	
	System.out.println(l.contains(m1));
	System.out.println(l.contains(m2));
	
	
	Iterator it = l.iterator();
	while(it.hasNext()) {
		marksheet m = (marksheet)it.next();
		System.out.print(" "+m.getChemestry());
		System.out.print(" "+m.getMaths());
		System.out.print(" "+m.getName());
		System.out.print(" "+m.getPhysics());
		System.out.print(" "+m.getRollno());
		System.out.println();
		
	}
	
	
	
	
	
		
		
		
		
	}

}
