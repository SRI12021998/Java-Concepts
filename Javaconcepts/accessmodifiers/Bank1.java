package accessmodifiers;

public class Bank1 
{

	public static void main(String[] args) 
	{
		Bank b=new Bank();
		System.out.println(b.interest_Rate);
		System.out.println(b.customer_Balance);
		System.out.println(b.no_Of_Deposits);
		b.accountOpening();
		b.balanceEnquiry();
		b.securityExchange();	
	}

}
