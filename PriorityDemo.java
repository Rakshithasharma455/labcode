package day6;
class PriorityRunnable implements Runnable
{
	private String threadName;
	private int sleepTime;
	public PriorityRunnable(String threadname, int sleepTime)
	{
		this.threadName = threadname;
		this.sleepTime = sleepTime;
	}
	public void run()
	{
		for (int i = 1;i<=5;i++)
		{
			System.out.println(threadName + "Iteration:" + i +"sleep time :" + sleepTime + "ms");
			try
			{
				Thread.sleep(sleepTime);
			}
			catch(InterruptedException e)
			{
				System.out.println(threadName + "was interrupted.");
			}
			
		}
		System.out.println(threadName + " complete");
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		PriorityRunnable lt = new PriorityRunnable("low priority thread",1000);
		PriorityRunnable mt = new PriorityRunnable("medium priority thread",500);
		PriorityRunnable ht = new PriorityRunnable("high priority thread",100);
		Thread lp = new Thread(lt);
		Thread mp = new Thread(mt);
		Thread hp = new Thread(ht);
		hp.setPriority(Thread.MAX_PRIORITY);
		mp.setPriority(Thread.NORM_PRIORITY);
		lp.setPriority(Thread.MIN_PRIORITY);
		hp.start();
		mp.start();
		lp.start();
	}

}
