package exceptionhandling;

public class TyrePunctureException extends Exception
{
	public void punctureException (boolean puncture) throws TyrePunctureException
	{
		if (puncture==true)
		{
			throw new TyrePunctureException();
		}
		else
		{
			System.out.println("Air full");
		}
	}
}
