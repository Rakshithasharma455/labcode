package day1;
class Shape
{
	double getArea()
	{
		return 0;
	}
} 
//subclass circle
class Circle extends Shape
{
	int radius;
	//creating a constructor
	public Circle (int radius)
	{
		this.radius = radius;
	}
	//overriding the getArea method
	 public double getArea()
	{
		 return Math.PI*radius*radius;
	}
}
// class creation
class Square extends Shape
{
	int length;

//constructor creating
	public Square(int length)
  {
	  this.length = length;
  }
//overriding getArea method
    public double getArea()
     {
	     return length * length;
     }
}
//creating subclass
class Rectangle extends Shape
{
	int width;
	int height;
	//constructor creating
	public Rectangle (int width,int height) 
	{
		this.width = width;
		this.height = height;
	}
	//overriding getArea method
	public double getArea()
	{
		return width*height;
	}
		
}
public class areaofrectangle {

	public static void main(String[] args) {
		Shape circle = new Circle(3);
		Shape square = new Square(5);
		Shape rectangle = new Rectangle(4,2);
		//calling getArea method 
		System.out.println("area of the circle:"+ circle.getArea());
		System.out.println("area of the square:"+ square.getArea());
		System.out.println("area of the rectangle:"+ rectangle.getArea());
	}

}
