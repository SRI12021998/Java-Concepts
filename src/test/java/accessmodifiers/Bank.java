package accessmodifiers;

public class Bank 
{
	public double interest_Rate=7.50;//all class & all package
	protected int customer_Balance=150000;//sub class & neighbour class
	int no_Of_Deposits=2000;//default or package level
	private int employee_Salary=50000;//only within the class
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		System.out.println(b.interest_Rate);
		System.out.println(b.customer_Balance);
		System.out.println(b.no_Of_Deposits);
		System.out.println(b.employee_Salary);
		b.accountOpening();
		b.balanceEnquiry();
		b.securityExchange();
		b.incrementToEmployees();
	}
	public void accountOpening()
	{
		System.out.println("Account opened");
	}
	protected void balanceEnquiry()
	{
		System.out.println("Available balance amount is -"+customer_Balance);
	}
	void securityExchange()
	{
		System.out.println("Scurities transferred");
	}
	private void incrementToEmployees()
	{
		System.out.println("hike given -"+(employee_Salary+1000));
	}
}
