package day6;
class RaceThread extends Thread
{
	public RaceThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i= 1;i<=3;i++)
		{
			System.out.println(getName() + "-Iteration:" +i);
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(getName() + "was interruted");
			}
		}
		System.out.println(getName() + "  has finished the race!");
	}
}

public class ThreadRace {

	public static void main(String[] args) {
		RaceThread t1 = new RaceThread("first winner");
		RaceThread t2 = new RaceThread("second winner");
		RaceThread t3 = new RaceThread("third winner");
		
		//setting the priorities
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
