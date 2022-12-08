package Serialisation_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CustomerInput {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("E:/Student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Customer c1 = (Customer) ois.readObject();
			Customer c2 = (Customer) ois.readObject();
			
			System.out.println(c1);
			System.out.println(c2);
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
