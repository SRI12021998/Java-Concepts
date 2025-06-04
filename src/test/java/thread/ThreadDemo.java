package thread;

public class ThreadDemo extends Thread
{

	public static void main(String[] args) 
	{
		ThreadDemo d=new ThreadDemo();
		d.start();
	}

	public void run() 
	{
		System.out.println("Example of single thread using Thread inheritance");
	}

}
