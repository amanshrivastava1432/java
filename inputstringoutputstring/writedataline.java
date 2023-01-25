package inputstringoutputstring;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writedataline {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\amans\\OneDrive\\Desktop\\xyz.txt");
		PrintWriter pw = new PrintWriter(out);
		for (int i = 0; i < 5; i++) {
			pw.println(i + ":line");
		}
		pw.close();
		out.close();
		System.out.println("donehnju");

	}

}