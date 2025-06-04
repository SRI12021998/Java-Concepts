package thread;
/*synchronized example 
 * should be written after access modifier
 * only one thread can access the synchronized methods at a time
*/
public class AtmMachine 
{
	int balance=1000;
	public synchronized void cashWithdrawl(String name, int amount)
	{
		if (amount<=balance)
		{
			balance-=amount;
			System.out.println("Cash withdrawl successful");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		System.out.println("Remaining balance: "+balance);
	}

}
