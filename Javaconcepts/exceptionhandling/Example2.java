package exceptionhandling;

public class Example2 
{

	public static void main(String[] args)
	{
		Example1 e1=new Example1();
		try
		{
			e1.bikeLend(100, 0);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Mandatory closure codes");
		}
	}

}
