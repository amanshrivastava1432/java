package collectionframework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class treemap {
	public static void main(String[] args) {
		
		TreeMap a =new TreeMap();
		a.put("101", "shuhana");
		a.put("102", "aman");
		a.put("103", "rajat");
		a.put("104", "rathore");
		System.out.println(a);
		System.out.println(a.get("102"));
		
		Set Keys = a.keySet();
		Iterator b= Keys.iterator();
		System.out.println("keys of map");
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		
	}

}
