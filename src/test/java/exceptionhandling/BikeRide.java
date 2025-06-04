package exceptionhandling;

public class BikeRide 
{

	public static void main(String[] args)
	{
		try
			{
				PetrolNotThereException p=new PetrolNotThereException();
				p.noPetrolException(10);
				TyrePunctureException t=new TyrePunctureException();
				t.punctureException(false);
			}
		catch (PetrolNotThereException pne)
			{
				System.out.println("No petrol");
			}
		catch (TyrePunctureException tpe)
			{
				System.out.println("Flat tyre");
			}
	}

}
