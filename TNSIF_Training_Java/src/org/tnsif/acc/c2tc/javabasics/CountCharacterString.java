package org.tnsif.acc.c2tc.javabasics;

public class CountCharacterString {

	public static void main(String[] args) {

		String str = "programming";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int count = 0;

			// Skip if the character was already counted
			boolean alreadyCounted = false;

			for (int k = 0; k < i; k++) {
				if (str.charAt(k) == ch) {
					alreadyCounted = true;
					break;
				}
			}

			if (alreadyCounted) {
				continue;
			}

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}

			System.out.println(ch + " = " + count);
		}
	}
}