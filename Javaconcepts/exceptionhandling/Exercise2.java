package exceptionhandling;

import java.util.InputMismatchException;

public class Exercise2 
{

	public static void main(String[] args) 
	{
		Exercise2 e2=new Exercise2();
		int result=e2.calculate(10,0);//if checked exception is there need to handle compulsory with try catch block
		System.out.println(result);
	}
	public int calculate(int a,int b)//Exception
	{
		/*try block should have either catch or finally or both
		 * finally block will be called always even with exception or without exception
		 * catch block will be called only when corresponding object is thrown
		 */
		try
		{
			int c=a/b;
			return c;
		}
		catch (ArithmeticException e)
		{
			
			return 0;
		}
		finally
		{
			System.out.println("this might get exception");
		}
		
	}
}
