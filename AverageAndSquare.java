package day6;
class AverageThreads extends Thread
{
	public void run()
	{
		int sum = 0;
		for(int i=1;i<=10;i++)
		{
		   sum +=i;
		}
		double average = sum/10.0;
		System.out.println("average of first 10 natural number:"+average);
		
	}
}
class SquareThread extends Thread
{
	public void run()
	{
		int[] arr = {1,20,50,15,30};
		System.out.println("Square of the array elements:");
		for(int num : arr)
		{
			System.out.println(num + "^2 ="+(num*num));
		}
	}
}

public class AverageAndSquare {

	public static void main(String[] args) {
		//creating thread objects
		AverageThreads at = new AverageThreads();
		SquareThread st = new SquareThread();
		at.run();
		st.run();
	}

}
