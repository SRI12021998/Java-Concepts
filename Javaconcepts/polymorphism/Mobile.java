package polymorphism;

public class Mobile 
{

	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		m.phoneCall();
		m.phoneCall(7010887596l);
		m.phoneCall("Divya");
	}
	/*method overloading-compile time polymorphism
	 * same method name different arguments
	*/
	public void phoneCall()
	{
		System.out.println("Direct call");
	}
	public void phoneCall(long number)
	{
		System.out.println("New number call");
	}
	public void phoneCall(String name)
	{
		System.out.println("Contact number call");
	}
}
