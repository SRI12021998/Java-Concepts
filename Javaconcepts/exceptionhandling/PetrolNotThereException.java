package exceptionhandling;

public class PetrolNotThereException extends Throwable//or Exception
{
	public void noPetrolException(int petrol) throws PetrolNotThereException 
	{
		if (petrol==0)
		{
			throw new PetrolNotThereException();
		}
		else
		{
			System.out.println("Petrol full");
		}
	}
}
