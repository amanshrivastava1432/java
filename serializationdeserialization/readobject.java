package serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class readobject{
	public static void main(String[] args) throws Exception{
		FileInputStream file= new FileInputStream("C:\\Users\\amans\\OneDrive\\Desktop\\xyz.txt");
		ObjectInputStream in=new ObjectInputStream(file);
		marksheet m =(marksheet)in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.phisics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		
	}

}
