package thread;

public class Withdrawl 
{

	public static void main(String[] args) 
	{
		AtmMachine atm=new AtmMachine();
		Thread t1=new Thread (()->atm.cashWithdrawl("Sriram", 750));
		Thread t2=new Thread (()->atm.cashWithdrawl("Divya",500));
		t1.start();
		t2.start();
	}

}
