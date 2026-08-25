package org.tnsif.acc.c2tc.arraydemo;

public class Simple2DArray {

	public static void main(String[] args) {
		int arr[][]= {{2,3},{1,4}};
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}