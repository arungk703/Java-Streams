package Piped_Stream;

import java.io.IOException;
import java.io.OutputStream;

public class Piped_Output_Stream extends Thread {
	OutputStream os;
	
	public Piped_Output_Stream(OutputStream os){
		this.os = os;
	}
	
	public void run() {
		int count = 1;
		while(true) {
			try {
				os.write(count);
				System.out.println("Producer" + count);
				count++;
				Thread.sleep(10);
			} catch (IOException e) {
				System.out.println(e);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
