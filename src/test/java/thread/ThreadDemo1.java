package thread;

public class ThreadDemo1 implements Runnable
{

	public static void main(String[] args) 
	{
		ThreadDemo1 d1=new ThreadDemo1();
		Thread t1=new Thread(d1);
		t1.start();
	}

	public void run() 
	{
		System.out.println("Example of single thread using Runnable interface inheritance");
	}

}
