package inheritance;

public class Sriram extends Balaji//multi level inheritance
{
	int salary=35000;
	public static void main(String[] args) 
	{
		Sriram s= new Sriram();
		s.Investment();
		s.savings();
		System.out.println(s.salary);
		s.newInvestment();
		System.out.println(s.getPension());
//		System.out.println(super.salary);can be use only under non static blocks
	}
	public void newInvestment()
	{
		System.out.println("Share market");
		System.out.println(super.salary);//super used to refer parent class object
		System.out.println(this.salary);
	}
//we cannot inherit from final class
}
