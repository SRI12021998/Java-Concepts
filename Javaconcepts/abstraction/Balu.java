package abstraction;

public class Balu extends Muthu
/*sub class should define abstract method of parent 
 *or subclass also will be a abstract class
 */
{

	public static void main(String[] args) 
	{
		Balu b=new Balu();
		b.propertyLandLoan();
	}

	@Override
	public void propertyLandLoan() 
	{
		System.out.println("Property Land Loan Completed");
	}
	public void investment()
	{
		System.out.println("FD");
	}
}
