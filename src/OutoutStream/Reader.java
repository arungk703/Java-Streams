package OutoutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("E:/Test.txt")){
			byte b[] = new byte[fis.available()];
			
			fis.read(b);
			
			String s = new String(b);
			s = s.toLowerCase();
			
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
