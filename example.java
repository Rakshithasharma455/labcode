package assignment4;

import java.util.Scanner;

class Car
{
	String make;             //attributes
	String model;
	short year;
	int price;
	// constructor
	public Car (String  make,String model, short year, int price)
	{
		this.make = make;
		this.model =model;
		this.year = year;
		this.price = price;
	}
	
}

public class example {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);//taking usre input
		String make = c.nextLine();
		String model = c.nextLine();
		short year = c.nextShort();
		int price = c.nextInt();

		System.out.println(" The car make:"+make);//displaying input
		System.out.println(" The car model:"+model);
		System.out.println(" The car year:"+year);
		System.out.println("The car price:"+price);
	
	}

}
