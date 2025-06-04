package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 
{
	public static void main(String[] args) 
	{
		Exercise1 obj=new Exercise1();
		Exercise1.enterValues();
	}
	public static void enterValues()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter value1");
			int a= scn.nextInt();
			System.out.println("Enter value2");
			int b= scn.nextInt();
			System.out.println("Result is "+a/b);
		}
		/*sub class exception should be given first 
		 * then parent class exception should be given 
		 * this is known as hierarchy of exception
		 */
		catch (InputMismatchException e1)
		{
			e1.printStackTrace();
			System.out.println(e1.getMessage());
			System.out.println("Please enter only numeric values");
			Exercise1.enterValues();
		}
		catch (ArithmeticException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("Cannot divide by 0");
			Exercise1.enterValues();
		}
		catch (Exception e3)//should be given at-last for handling unknown exception
		{
			System.out.println("Unknown exception");
		}
	}
}
