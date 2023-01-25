package inputstringoutputstring;

import java.io.FileWriter;
import java.io.IOException;

public class rightafile {
	public static void main(String[] args) throws IOException {
		
	
	FileWriter out = new FileWriter("C:\\Users\\amans\\OneDrive\\Desktop\\xyz.txt");
	out.write('a');
	out.write("this is line one");
	out.write("this is two line");
	out.close();
	System.out.println("done");
	

}
}