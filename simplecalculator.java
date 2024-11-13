package day4;

import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("enter the first number:"); //taking the user inputs
			double n1 = s.nextDouble();
			System.out.println("enter the second number:");
			double n2 = s.nextDouble();
			//taking user to enter the operator
			System.out.println("enter an operator(+,-,*,/):");
			char operator = s.next().charAt(0);
			double result;
			//perform calculating  based on the operator
			switch(operator) {
			case '+':
				result = n1 + n2;
				System.out.println("result:"+result);
				break;
			case '-':
				result = n1 - n2;
				System.out.println("result:" +result);
				break;
			case '*':
				result = n1 * n2;
				System.out.println("result:"+result);
				break;
			case '/':
				if(n2 == 0)
				{
					System.out.println("error:division by zero is not allowed");
				}
				else
				{
					result = n1/n2;
					System.out.println("result:"+result);
				}
				break;
			}
		}
			
			catch(Exception e)
			{
				System.out.println("error:invalid input.please enter numeric values for number");
			}

		

	}

}
