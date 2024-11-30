package day5;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//input the dimensions of the matrices
		System.out.println("Enter the number of rows:");
		int rows = s.nextInt();
		System.out.println("Enter the number of columns:");
		int columns = s.nextInt();
		
		//declare 2D arrays for the matrices using the integer
		Integer[][] matrix1 = new Integer[rows][columns];
		Integer[][] matrix2 = new Integer[rows][columns];
		Integer[][] matrix = new Integer[rows][columns];
		
		//input the first matrix
		System.out.println("Enter the element of the first matrix:");
		for(int i = 0;i < rows;i++)
		{
			for(int j = 0;j < columns;j++)
			{
				System.out.println("element[" +i+"][" +j +"]:");
			     matrix1[i][j] = s.nextInt();
			}
		}
		//input the second matrix
		System.out.println("Enter the elements of the second matrix:");
		for(int i = 0;i < rows;i++) 
		{
			for(int j = 0;j < columns;j++)
			{
				System.out.println("element[" +i+"][" +j +"]:");
				matrix2[i][j] = s.nextInt();
			}
		}
		//perform matrix addition
		for(int i = 0;i < rows;i++)
		{
			for(int j = 0;j < columns;j++)
			{
				matrix[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		//display the resulting matrix
		System.out.println("The resulting matrix after addition is:");
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
			{
				System.out.println(matrix[i][j] +" ");				
			}
		}
		System.out.println();

	}

}
