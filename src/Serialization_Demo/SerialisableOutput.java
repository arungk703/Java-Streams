package Serialization_Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisableOutput {

	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Arun","ECE",92.5f);
		FileOutputStream fos;
		ObjectOutputStream oos; 
		
		try {
			fos = new FileOutputStream("E:/Student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			fos.close();
			oos.close();
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
