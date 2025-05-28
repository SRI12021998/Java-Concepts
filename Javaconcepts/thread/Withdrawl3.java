package thread;

public class Withdrawl3 //without lambda function
{

	public static void main(String[] args) 
	{
		AtmMachine atm=new AtmMachine();
		Thread t1=new Thread(()->atm.cashWithdrawl("Balaji", 990));
		
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				atm.cashWithdrawl("Punitha", 100);
			}
		});
		t1.start();
		t2.start();
	}

}
