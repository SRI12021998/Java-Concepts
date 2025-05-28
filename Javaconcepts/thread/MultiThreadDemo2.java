package thread;

public class MultiThreadDemo2 extends MultiThreadDemo
{

	public static void main(String[] args) 
	{
		MultiThreadDemo mt=new MultiThreadDemo();
		Thread t1=new Thread(mt);
		
		MultiThreadDemo2 mt2=new MultiThreadDemo2();
		Thread t2=new Thread(mt2);
		
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		t2.start();
		
	}
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Child class thread"+i);
		}
	}
}
