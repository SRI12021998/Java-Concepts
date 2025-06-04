package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 
{

	public static void main(String[] args) 
	{
		Exercise3 e3=new Exercise3();
		e3.multiExceptionCaller();
	}

	private void multiExceptionCaller() 
	{
		try
		{
			Exercise3 e3=null;
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter any integer value");
			int a=scn.nextInt();
//			System.out.println(e3.hashCode());
		}
		catch (NullPointerException|InputMismatchException ex2)
		{
			System.out.println("username or password incorrect");
			System.out.println(ex2.getMessage());
		}
		finally
		{
			System.out.println("After exception");
		}
	}

}
