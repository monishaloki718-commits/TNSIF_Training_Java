package org.tnsif.acc.c2tc.javabasics;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = {10, 25, 5, 40, 30};

		int largest = arr[0];
		int second = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else if (arr[i] > second && arr[i] != largest) {
				second = arr[i];
			}
		}

		System.out.println("Second largest = " + second);
	}
}