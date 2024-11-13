package assignment4;

import java.util.Scanner;

class Calculator
{
	int add1(int a,int b)
	{
		return a+b;
	}
	int add2(int a, int b, int c)
	{
		return a+b+c;
	}
	double add3(double x, double y)
	{
		return x+y;
	}
}

public class methooverloading {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		int b = i.nextInt();
		System.out.println("Sum of two integer " + (a+b));
		int c = i.nextInt();
		System.out.println("Sum of three integer "+(a+b+c));
		double x = i.nextDouble();
		double y = i.nextDouble();
		System.out.println("Sum of two double " +(x+y));
	}

}