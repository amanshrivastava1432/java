package inputstringoutputstring;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readtextfile {

	public static void main(String[]args) throws IOException {
		FileReader in = new FileReader("C:\\input.txt");

		int ch = in.read();
		while (ch != -1) {
			System.out.println((char) ch);
			ch = in.read();
		}
		in.close();
		

	}

}
