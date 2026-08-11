package org.tnsif.acc.c2tc.javabasics;

public class CheckStringPalindrome {

	public static void main(String[] args) {

		String str = "madam";

		String reverse = new StringBuilder(str).reverse().toString();

		if (str.equals(reverse)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}
}
