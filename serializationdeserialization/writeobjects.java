package serializationdeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeobjects {

	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream("C:\\Users\\amans\\OneDrive\\Desktop\\xyz.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		marksheet m =new marksheet();
		m.name="ram";
		m.phisics=54;
		m.maths=50;
		m.chemistry=45;
		
		out.writeObject(m);
		out.close();
		file.close();
		
		
		
		
	}
}
