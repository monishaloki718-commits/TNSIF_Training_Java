package org.tnsif.acc.c2tc.string;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=s1; //s2 =hello
		
		s1="world";
		
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);

	}

}
