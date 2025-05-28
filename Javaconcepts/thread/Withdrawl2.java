package thread;

public class Withdrawl2 implements Runnable 
{
	AtmMachine atm;
	String name;
	int amount;
	Withdrawl2(AtmMachine atm,String name,int amount)
	{
		this.atm=atm;
		this.name=name;
		this.amount=amount;
	}
	
	public static void main(String[] args) 
	{
		AtmMachine atm=new AtmMachine();
		Withdrawl2 wdl=new Withdrawl2 (atm, "Sriram", 750);
		Withdrawl2 wd2=new Withdrawl2 (atm, "Divya", 750);
		Thread t1=new Thread(wdl);
		Thread t2=new Thread(wd2);
		t1.start();
		t2.start();
	}
	
	public void run() 
	{
		atm.cashWithdrawl(name, amount);
	}

}
