package Serialization_Demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialisableInput {
	public static void main(String args[]) {
	try {
	FileInputStream fis = new FileInputStream("E:/Student.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student s1 = (Student) ois.readObject();
	System.out.println(s1);
	
	
	fis.close();
	ois.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}

}
