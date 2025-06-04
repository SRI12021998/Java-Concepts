package constructor;
//constructors are used to initialize object specific variables
public class Example1 
{
	long order_Id;
	double oh_Value;
	int user_Id;
	String invoice_No;
	String emp_Name;
	long emp_No;
	int emp_Age;
	char emp_Gender;
	boolean emp_Married;
	Example1(long order_Id, double oh_Value,int user_Id,String invoice_No)
	{
		this.order_Id=order_Id;//this refers to current class instance
		this.oh_Value=oh_Value;
		this.user_Id=user_Id;
		this.invoice_No=invoice_No;
	}
	//constructor overloading
	Example1(String emp_Name, long emp_No, int emp_Age, char emp_Gender , boolean emp_Married) 
	{
		this.emp_Name= emp_Name;
		this.emp_No= emp_No;
		this.emp_Age=emp_Age;
		this.emp_Gender=emp_Gender;
		this.emp_Married=emp_Married;
	}
	Example1()
	{
		
	}

	public static void main(String[] args) 
	{
		Example1 e=new Example1(684608282024133028l,21174.89,6846,"BFC333100000147");
		e.orderDetails();
		Example1 e1=new Example1(684608282024133421l,21100.00,6847,"BFC333100000146");
		e1.orderDetails();
		Example1 e2=new Example1("sriram",7010887596l,26,'M',true);
		System.out.println(e2.emp_Name);
		System.out.println(e2.emp_No);
		System.out.println(e2.emp_Age);
		System.out.println(e2.emp_Gender);
		System.out.println(e2.emp_Married);
	}
	private void orderDetails()
	{
		System.out.println(order_Id);
		System.out.println(oh_Value);
		System.out.println(user_Id);
		System.out.println(invoice_No);
//		this.orderDetails(); //this can be used only under non static blocks
	}
}
