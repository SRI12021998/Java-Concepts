package abstraction;

public abstract class Muthu
{
public Muthu()
{
	System.out.println("GF constructor");
}

	public static void main(String[] args) 
	{
//		Muthu m= new Muthu();//cannot create object for abstract class
//		m.propertyHouseLoan();
	}
	public void propertyHouseLoan()
	{
		System.out.println("House Loan Completed");
	}
	abstract public void propertyLandLoan();
	//when a method is abstract then the class should be abstract class
}
