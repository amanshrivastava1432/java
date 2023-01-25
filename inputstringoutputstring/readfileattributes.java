package inputstringoutputstring;

import java.io.File;

public class readfileattributes {
	
	public static void main(String[] args) {
		File f =new java.io.File("C:\\Users\\amans\\OneDrive\\Desktop\\xyz.txt");
       if(f.exists()) {
    	   System.out.println("name"+f.getName());
    	   System.out.println("absoute path:"+f.getAbsolutePath());
		
		
	}

	}}
