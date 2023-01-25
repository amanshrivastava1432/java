package inputstringoutputstring1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtext {

	public static void main(String[] args) throws IOException {
		
	FileReader r=new FileReader("C:\\Users\\amans\\OneDrive\\Desktop\\ironman.txt");
	int ch=r.read();
	while( ch!=-1) {
		System.out.println((char)ch);
		ch = r.read();
	}
	r.close();
	}
}
