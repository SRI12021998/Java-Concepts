package polymorphism;

public class Admin extends Cashier
{

	public static void main(String[] args) 
	{
		Admin a=new Admin();
		a.bankDeposit();
		a.cashReconciliation();
		a.cashReconciliation();
		System.out.println(a);
	}
	/*
	 * run time polymorphism
	 * same declaration different definition
	 */
	public void cashReconciliation()//overriding
	{
		System.out.println("Cash Reconciliation by Admin");
	}
	public void employeeVoucherCreate()
	{
		System.out.println("Employee Voucher Create by Admin");
	}
	public void bankDeposit()
	{
		System.out.println("BankDeposit by Admin");
	}
	/*
	 * we can increase the visibility of data member/member functions 
	 * but we cannot decrease the visibiity
	 */
//	public String toString()
//	{
//		return "goinda";
//		
//	}
}
