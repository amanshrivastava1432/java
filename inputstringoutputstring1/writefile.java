package inputstringoutputstring1;

import java.io.FileWriter;
import java.io.IOException;

public class writefile {
	
	public static void main(String[] args) throws IOException {
		FileWriter sumit = new FileWriter("C:\\Users\\amans\\OneDrive\\Desktop\\sumit.txt");
		sumit.write("aman");
		sumit.write("shrivastava");
		sumit.write("only given in one line");
		sumit.write("given two scentences");
		sumit.close();
		System.out.println("done");
		
	}

}
