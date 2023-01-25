package BASIC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testdatefunction {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String str= format.format(d);
		System.out.println("date="+str);
		
	    String str1 = "5/12/1993";
	    Date d1 = format.parse(str1);
	    System.out.println(d1);
	    
	    
		
				

	}

}
