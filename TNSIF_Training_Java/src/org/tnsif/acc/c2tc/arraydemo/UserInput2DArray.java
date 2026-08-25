package org.tnsif.acc.c2tc.arraydemo;
import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of row");
		int rows=scan.nextInt();
		System.out.println("enter number of column");
		int col=scan.nextInt();
		
		int multidemensionarray[][]=new int[rows][col];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				multidemensionarray[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(multidemensionarray[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}