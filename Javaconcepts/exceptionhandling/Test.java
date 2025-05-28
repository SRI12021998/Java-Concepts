package exceptionhandling;

public class Test 
{
	public static void main(String[] args) 
	{
		PasswordException pe=new PasswordException();
		String s="sriramdivyapriyasb";
		try
		{//checked exception should be handled compulsory with throws or try, catch
			pe.login(s);
		}
		catch (PasswordException q)
		{
			if (s.length()<8)
			{
				System.out.println("Length is too short");
			}
			else if (s.length()>16)
			{
				System.out.println("Length is too long");
			}
		}
	}
}