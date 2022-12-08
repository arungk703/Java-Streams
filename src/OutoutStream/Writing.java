package OutoutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) {
		
			try (FileOutputStream fos = new FileOutputStream("E:/Test.txt")) {
				String s = "Java Programming";
					s = s.toUpperCase();
				fos.write(s.getBytes());
				s = "Arun";
				fos.write(s.getBytes());
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found" + e);
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
