package Serialisation_Assignment;

import java.io.Serializable;

public class Customer implements Serializable {
	
	String custId;
	String name;
	String phno;
	
	static int count = 0;

	public Customer(String name, String phn0) {
		this.name = name;
		this.phno = phn0;
		custId = "C"+ (++count);
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", phno=" + phno + "]";
	}
	
	
	
	
	

}
