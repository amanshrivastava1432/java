package collectionframework;

import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(1);
		System.out.println(list);
		list.add("aman");
		System.out.println(list.get(1));
		list.add('c');
		System.out.println();
		
		list.add(10.20);
		System.out.println();

		 ArrayList l= new ArrayList();
		 l.add(51);
		 l.add(5);
		 
		 l.addAll(list);
		 
		 System.out.println(1);
		 
		 boolean ab = l.contains("aman");
		 System.out.println(ab);
		 
		 System.out.println(l.isEmpty());
		 
		 System.out.println(l.remove(1));
		 
		 System.out.println(l.iterator());
		 
		 System.out.println(l.size());
		 System.out.println(l.retainAll(l));
		
		
	}
	}


