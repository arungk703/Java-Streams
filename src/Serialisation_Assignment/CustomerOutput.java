package Serialisation_Assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomerOutput {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("E:/Student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Customer c1 = new Customer("Arun","9618353843");
			Customer c2 = new Customer("Rahul","123456789");
			
			oos.writeObject(c1);
			oos.writeObject(c2);
			
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
