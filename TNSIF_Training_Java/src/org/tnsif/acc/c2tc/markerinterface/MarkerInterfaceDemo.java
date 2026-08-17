package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registration sushma=new Student(12,"Sushma",30000.00,"Java Programmming");
		Registration anil=new Student(13,"Anil",30000.00,"Java Programming");
		Object obj=new Object();
		
		if(obj instanceof Registration)
		{
			System.out.println("Student is registered for the course ");
		}
		else
		{
			System.out.println("Student is not registered for the course");
		}
		
	}

}