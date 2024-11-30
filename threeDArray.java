package day5;

import java.util.Scanner;

public class threeDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//initialize a 3D array
		System.out.print("Enter the size of the 3D array(x,y,z):");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int[][][] array = new int[x][y][z];
		//input values for the 3D array
		System.out.println("Enter the element of the 3D array:");
		for(int i = 0;i < x;i++)
		{
			for(int j = 0;j < y;j++)
			{
				for(int k = 0;k < z;k++)
				{
					System.out.println("Element[" +i +"][" + j +"][" + k +"]:");
					array[i][j][k] = s.nextInt();
				}
			}
		}
		//display the array
		System.out.println("Enter the element of the 3D array:");
		for(int i = 0;i < x;i++)
		{
			for(int j = 0;j < y;j++)
			{
				for(int k = 0;k < z;k++)
				{
					System.out.print(array[i][j][k] + " ");
				}
					System.out.println();
				}
			 System.out.println();
			}
		//find the maximum value in the array
         int maxValue = Integer.MIN_VALUE;
         int sum = 0;
         int count = 0;
         for(int[][] matrix:array)
            {
	             for(int []row : matrix)
	             {
	            	 for(int element : row)
	            	 {
	            		 if (element > maxValue)
	            		 {
	            			 maxValue = element;	            			 
	            		 }
	            		 sum += element;
	            		 count++;
	            	 }
	             }
            }
         //calculating the average of the elements
         double average = (double) sum/count;
         //display results
         System.out.println("maxium value in the array :"+maxValue);
         System.out.println("average of all elements:" +average);
	}
}
         

