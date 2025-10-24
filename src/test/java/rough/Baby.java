package rough;
import inheritance.Sriram;//when we inherit from another package need to import the class
public class Baby extends Sriram
{
	public Baby(int a)
	{
		
	}
	public int age=1;
	private int pension=0;
	protected int savings=0;
	int food=5;
	public static void main(String[] args) 
	{
		Baby b=new Baby(1);
		System.out.println(b.savings);
		b.savings();
		b.Investment();
		b.newInvestment();
	}
}
