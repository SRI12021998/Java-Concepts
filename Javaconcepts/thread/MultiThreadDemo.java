package thread;

public class MultiThreadDemo implements Runnable
{

	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Parent class thread"+i);
		}
	}
	
}
