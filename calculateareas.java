package day3;
abstract class shape          //creating abstract class 
{
	//abstract method to calculate area 
	public abstract double calculateArea();
}
//creating a subclass for circle
class Circle extends shape
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	//overriding 
	public double calculateArea()
	{
		return Math.PI*radius*radius;
	}
}
//creating a subclass for rectangle
class rectangle extends shape
{
	double width;
	double height;
	public rectangle(double width,double height)
	{
		this.width = width;
		this.height = height;
	}
	//overriding 
	public double calculateArea()
	{
		return width*height;
	}
}

public class calculateareas {

	public static void main(String[] args) {
		shape Circle = new Circle(5);
		shape rectangle = new rectangle(2,4);
		System.out.println("area of circle :"+Circle.calculateArea());
		System.out.println("area of rectangle :"+rectangle.calculateArea());
		

	}

}
