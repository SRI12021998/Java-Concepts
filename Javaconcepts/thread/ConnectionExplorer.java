package thread;


public class ConnectionExplorer
{

	public static void main(String[] args) 
	{
		Connection c=new Connection();
		Thread t1=new Thread(()->c.downloading());
		Thread t2=new Thread(()->c.internetConnection());
		t1.start();
		t2.start();
	}
}