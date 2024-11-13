package day2;
class Vehicle              //creating class vehicle
{
	void start() 
	{
		System.out.println("vehicle started");
	}
}
//creating a subclass for car
class car extends Vehicle
{
	//overriding method
	void start()
	{
		System.out.println("car  started");
	}
}
//creating a subclass for motorcycle
class motorcycle extends Vehicle
{
	//overriding method
	void start()
	{
		System.out.println("Motorcycle started");
	}
}
//creating a class for garage
class garage
{
	void serviceVehicle(Vehicle vehicle)
	{
		vehicle.start();
		System.out.println("vehicle serviced");
	}
}

public class vehiclemethod {

	public static void main(String[] args) {
		car c = new car();
		motorcycle mc = new motorcycle();
		garage g = new garage();
		g.serviceVehicle(c);
		g.serviceVehicle(mc);

	}

}
