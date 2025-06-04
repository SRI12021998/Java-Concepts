package inheritance;

public class Muthaiah 
{
	public Muthaiah()
	{
		System.out.println("GF constructor");
	}
	public int age=85;
	private int pension=20000;
	protected int savings=100000;
	int food=3; //package level or default level access
	public static void main(String[] args) 
	{
		
	}
	public void savings()
	{
		System.out.println("Savings");
	}
	public int getPension()
	{
		int pension=this.pension;
		return pension;
	}
}
