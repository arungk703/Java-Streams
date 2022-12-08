package File_Stream_Demo;

import java.io.File;

public class Accesing_Files {

	public static void main(String[] args) {
		File f = new File("E:/Vue");
		File files[] = f.listFiles();
		f.setReadOnly();
		for(File x:files) System.out.println(x);
	}

}
