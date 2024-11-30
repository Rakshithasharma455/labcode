package day5;

import java.util.Scanner;

public class SumofAverageArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//asking the user for the number
		System .out.println("Enter the number of element in the array:");
		int n = s.nextInt();
		//creating the array to hold the element
		int[] array = new int[n];
		//getting the element from the user
		System.out.println("enter the element in the array:");
		for(int i = 0;i < n;i++)
		{
			array[i] = s.nextInt();			
		}
		//calculating the sum of the array elements
		int sum = 0;
		for (int num : array)
		{
			sum += num;
		}
		//calculating the arvage 
		double average = (double)sum/n;
		//outputing the sum and average
		System.out.println("Sum of tha array element :" +sum);
		System.out.println("Average of the array element :" +average);
	}
}
