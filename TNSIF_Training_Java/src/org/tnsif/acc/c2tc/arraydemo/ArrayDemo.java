package org.tnsif.acc.c2tc.arraydemo;

public class ArrayDemo {
	public static void main(String[] args) {
		
		
//	//static value
//	 {
//		int nums[] = { 5,6,7,8};
//		System.out.println(nums[2]);
//		nums[2]=9;
//		System.out.println(nums[2]);
//	}
	
	//Dynamic value
//	int nums[]=new int[4];
//	nums[0]=2;
//	nums[1]=4;
//	nums[2]=3;
//	nums[3]=6;
//	
//	System.out.println(nums[0]);
//	System.out.println(nums[1]);
//	System.out.println(nums[2]);
//	System.out.println(nums[3]);

		
		//using for loop 
		int nums[]=new int[4];
		nums[0]=2;
		nums[1]=4;
		nums[2]=3;
		nums[3]=6;
		
		for (int i=0;i<=3;i++)
		{
			System.out.println(nums[i]);
		}
		
		
}
}