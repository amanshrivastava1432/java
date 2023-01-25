package BASIC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
public static void main(String[] args) throws ParseException {
Date d = new Date();
System.out.println("Date By System Generated "+d);

SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
String str=format.format(d);

System.out.println();
System.out.println("date="+str);
System.out.println();


String str1= new String("05/12/1993");
Date d1=format.parse(str1);
System.out.println(d1);





}
}