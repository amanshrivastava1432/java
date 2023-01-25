package collectionframework;

import java.util.HashMap;

public class map {
	
	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		
		map.put("ra101", "aman");
        map.put("102", "akshit"); 
        map.put("103", "shubham");
        map.put("104","rajat");
		map.put("105", "mohit");
		
		System.out.println(map.get("105"));
		
	}

}
