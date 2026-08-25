package org.tnsif.acc.c2tc.arraydemo;

public class JaggedArray {

	public static void main(String[] args) {
		
		//step 1 : declare the jagged array
		
		int[][] studentInGrade=new int[3][];
		
		//step 2:initialize sub array
		
		studentInGrade[0] =new int[2]; //grade 1 has 2 students
		studentInGrade[1]=new int[3];  //grade 2 has 3 students
		studentInGrade[2]=new int[1]; //grade 3 has 1 students
		
		//step 3 : assign values to the elements
		
		studentInGrade[0][0]=10; // grade 1 student 1
		studentInGrade[0][1]=20; //grade 1 student 2
		
		
		studentInGrade[1][0]=30; // grade 2 student 1
		studentInGrade[1][1]=40; //grade 2 student 2
		studentInGrade[1][2]=50; //grade 2 student 3
		
		
		studentInGrade[2][0]=60; //grade 3 student 1
		
		for (int i=0;i<studentInGrade.length;i++) // iterate thro each grade 3
		{
			for (int j=0;j<studentInGrade[i].length;j++)// loop thr each student in the grade
			{
				System.out.println("Grade" + (i+1) + "student" + (j+1)+ ":"  +studentInGrade[i][j]);
			}
		}
		
		
		
	}

}