package exceptionhandling;

public class PasswordException extends Exception
{

	public  void login(String password) throws PasswordException
	{
		if (password.length()<8||password.length()>16)
		{
			
			PasswordException pe=new PasswordException();
			throw pe;
		}
	}

}
