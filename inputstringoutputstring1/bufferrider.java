package inputstringoutputstring1;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferrider {

	public static void main(String[] args) throws IOException {
		
	FileReader a =new FileReader("C:\\Users\\amans\\OneDrive\\Desktop\\ironman.txt");
	BufferedReader b= new BufferedReader(a);
	
	String line = b.readLine();
	while(line!=null) {
		System.out.println(line);
	
		line=b.readLine();
	}
	
	b.close();
	}
}
