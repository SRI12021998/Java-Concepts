package rough;

public class Instance 
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		System.out.println(Baby.class.getDeclaredConstructor(Integer.class));
	}

}
