package rough;

import accessmodifiers.Bank;

public class Rough extends Bank
{

	public static void main(String[] args) 
	{
		System.out.println("hi");
		Bank b=new Bank();
		Rough r=new Rough();
		System.out.println(b.interest_Rate);
		System.out.println(r.customer_Balance);//protected can be accessed by sub class
		b.accountOpening();
		r.balanceEnquiry();//protected can be accessed by sub class
		String s1="Sriram";
		String s2="Sriram";
		System.out.println(s1==s2);
	}

}
