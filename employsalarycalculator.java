package day2;

import java.util.Scanner;

public class employsalarycalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice = 1;//initializing to enter the loop
		while( choice != -1)
			//taking basic salary 
		{
			System.out.println("enter the basic salary of the employee(or enter -1 to exit):");
			double basicSalary = s.nextDouble();
			if(basicSalary == -1)
			{
				break;
			}
			double hra,da,grossSalary;
			//calculating HRA and DA 
			if(basicSalary > 15000)
			{
				hra = 0.20*basicSalary;
				da = 0.60*basicSalary;
			}
			else
			{
				hra = 3000;
				da = 0.70*basicSalary;
			}
			//calculating grossSalary
			grossSalary = basicSalary+hra+da;
			System.out.println("grass salary :"+grossSalary);
			System.out.println("enter 1 to calculate another employee salary or -1 to exit:");
			choice= s.nextInt();
			
		}
		

	}

}
