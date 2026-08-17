package org.tnsif.acc.c2tc.exceptionhandling;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		int numbers[] =new int[4]; //4 elements 0-3
		try
		{
			numbers[9] = 50/0;
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception "+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index exception "+ e.getMessage());
		}

	}

}