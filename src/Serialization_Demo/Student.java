package Serialization_Demo;

import java.io.Serializable;

public class Student implements Serializable {
	int rollNo;
	String name;
	String Dept;
	float score;
	public static int section = 1;
	
	
	public Student() {
		
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", Dept=" + Dept + ", score=" + score + "]";
	}


	public Student(int rollNo, String name, String dept, float score) {
		this.rollNo = rollNo;
		this.name = name;
		Dept = dept;
		this.score = score;
	}
	
	

}
