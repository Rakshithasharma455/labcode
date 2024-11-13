package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class integerhandler {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("please enter the integer value:");
		int n = s.nextInt();
		System.out.println("you entered:"+n);
		}
		catch(InputMismatchException e)
		{
			System.out.print("error: you must enter an integer value");
			
		}
		
	}

}
