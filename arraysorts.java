package day5;

import java.util.Scanner;

public class arraysorts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//the size of the array
		System.out.println("Enter the number of the element in the array: ");
		int n =  s.nextInt();
		int[] array  = new int[n];
		//input the array elements
		System.out.println("Enter the element of the array:");
		for(int i = 0;i < n;i++)
		{
			array[i] = s.nextInt();
		}
		//sort the array using bubble sort
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n-i-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		//print the sorted array
		System.out.println("Sorted array in ascending order :");
		for(int num : array)
		{
			System.out.println(num+ " ");
		}
	}

}
