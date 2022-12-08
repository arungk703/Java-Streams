package Data_Input_Output_Demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		
		float arr[] = {1.2f,2.444f,10,89f,9.9999f,2234.849f} ;
		
		try {
			FileOutputStream fos = new FileOutputStream("E:/Student.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(arr.length);
			
			for(float x:arr) {
				dos.writeFloat(x);
			}
			
			fos.close();
			dos.close();
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
