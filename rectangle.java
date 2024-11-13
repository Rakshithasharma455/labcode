package assignment2;

public class rectangle {
	int length;
	int width;
	

	public static void main(String[] args) {
		rectangle r1 = new rectangle();
		r1.length = 3;
		r1.width = 2;
		int area1 =r1.length * r1.width;
		
		rectangle r2 = new rectangle();
		r2.length = 4;
		r2.width = 2;
		int area2 = r2.length * r2.width;
		
	if(area1>area2)
	{
		System.out.println("rectangle1 > rectangle2");
	}
	else if(area1<area2)
	{
		System.out.println("rectangle1 < rectangle2");
		
	}
	else
	{
		System.out.println("they are equal");
		
	}
			
				

	}

}
