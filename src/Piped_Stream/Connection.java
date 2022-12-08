package Piped_Stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Connection {

	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		Piped_Input_Stream consumer = new Piped_Input_Stream(pis);
		Piped_Output_Stream producer = new Piped_Output_Stream(pos);
		
		try {
			pis.connect(pos);
			producer.start();
			consumer.start();
		} catch (IOException e) {
			System.out.println("Connection issue");
		}
		
		

	}

}
