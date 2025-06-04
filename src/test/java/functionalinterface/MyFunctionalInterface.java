package functionalinterface;
@FunctionalInterface//if this is added it will not allow to add more than one abstract method
public interface MyFunctionalInterface 
{
	public void surviveLife();
	static void instagram()
	{
		System.out.println("Wasting time");
	}
}
