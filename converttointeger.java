package day4;

import java.util.Scanner;

public class converttointeger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		try {
			String userInput = s.nextLine();
			int n = Integer.parseInt(userInput);
			System.out.println("the converted integer number is :"+n);
		}
		catch(NumberFormatException e) {
			System.out.println("error:the input is not a vaild integer");
		}
		catch(NullPointerException e) {
			System.out.println("error:the input is null.");
		}
		

	}

}
