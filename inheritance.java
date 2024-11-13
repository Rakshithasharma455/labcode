package day1;
class Vehicle
{
	//attributes
	String make;
	String model;
	int year;
	int maximumSpeed;
	//constructor
	public Vehicle(String make,String model,int year,int maximumSpeed)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.maximumSpeed = maximumSpeed;
	}
	public void drive()
	{
		System.out.println("the vehicle is driving.");
	}
	public void printAttributes()
	{
		System.out.println("make:"+ make + ",model:"+ model + ",year:"+ year + ",maximumSpeed:"+ maximumSpeed + "km/h");
	}
}
//subclass car
class Car extends Vehicle
{
        public Car(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}
       //override
        public void drive()
        {
        	System.out.println(make + " "+ model + "car is driving");
        }
	
}
//subclass bike
class Bike extends Vehicle
{

	public Bike(String make, String model, int year, int maximumSpeed) {
		super(make, model, year, maximumSpeed);
	}
	//override
	public void drive()
	{
		System.out.println(make + " " + model + "bike is driving");
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		Car c = new Car("TATA","Nexon",2024,180);
		Bike b = new Bike("hero","Xtreme",2024,110);
		System.out.println("car details:");
		c.printAttributes();
		c.drive();
		System.out.println("bike detail:");
		b.printAttributes();
		b.drive();
	}

}
