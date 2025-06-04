package composition;

public class Engine 
{
	private int noOfCylinder;
	private String type;
	public Engine (int noOfCylinder, String type)
	{
		this.noOfCylinder=noOfCylinder;
		this.type=type;
	}
	public void startEngine()
	{
		System.out.println("Engine Starting");
	}
}
