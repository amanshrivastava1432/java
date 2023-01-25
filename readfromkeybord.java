import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;





public class readfromkeybord {
public static void main(String[] args) throws IOException {
	InputStreamReader isReader=new InputStreamReader(System.in);
	
	PrintWriter out=new PrintWriter("C:\\Users\\amans\\OneDrive\\Desktop\\write.txt");
	BufferedReader in=new BufferedReader(isReader);
	String line = in.readLine();
	while(!line.equals("quit")) {
		out.println(line);
		line=in.readLine();
	}
	out.close();
	in.close();
	
	
	
}
}
