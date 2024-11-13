package day2;

import java.util.Scanner;

public class evenoddcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evencount = 0;
		int oddcount = 0;
		while(true)
		{
			System.out.println("enter a number(or type 'stop' to finish):");
			String input = sc.nextLine();
			//check if the user to stop
			if(input.equalsIgnoreCase("stop"))
			{
				break;
			}
        	if(input.matches("-?\\d+"))
			{
			int number = Integer.parseInt(input);
			if (number % 2 ==0)
			{
				evencount++;
		}
		else 
		{
			oddcount++;
		}
			}
			else
		
		{
			System.out.println("please enter a valid integer or 'stop' to finish");
		}

	}
        	//display the results
        	System.out.println("total even number:"+evencount);
        	System.out.println("total odd number:"+oddcount);
		
	}
}
		
	
	


