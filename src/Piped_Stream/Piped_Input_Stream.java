package Piped_Stream;

import java.io.IOException;
import java.io.InputStream;


public class Piped_Input_Stream extends Thread {
	InputStream os;
	
	public Piped_Input_Stream(InputStream os){
		this.os = os;
	}
	
	public void run() {
		int x;
		while(true) {
			try {
				x = os.read();
				System.out.println("Consumer " + x);
			} catch (IOException e) {
				System.out.println("IO Exception");
			}
			
		}
	}

}
