package org.tnsif.c2tc.javabasic;

public class VariableDemo {
	int price=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message = "hello Students";
	public static void main(String[]args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
	}

}