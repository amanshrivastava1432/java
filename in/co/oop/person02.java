package in.co.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class person02 {

	public static void main(String[] args) {

		Date d = new Date("05/12/1993");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.format(d);
		person1 p = new person1();
		p.setDate(d);
		p.setName("aman shrivastava");
		// p.setDate(05/12/1993);
		p.setAddress("A-302,gulmohar,ashirvad villa");
		System.out.println(p.getName());
		System.out.println(p.getDate());

	}

}
