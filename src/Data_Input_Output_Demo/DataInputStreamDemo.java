package Data_Input_Output_Demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		
		float arr[];
		
		try {
			FileInputStream fis = new FileInputStream("E:/Student.txt");
			DataInputStream dis = new DataInputStream(fis);
			int l = dis.readInt();
			arr = new float[l];
			int i=0;
			
			while(i < l) {
				arr[i++] = dis.readFloat();
			}
			
			for(float j:arr) {
				System.out.println(j);
			}
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
