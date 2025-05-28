package constructor;

public class Chaining1 
{
	Chaining1()
	{
		System.out.println("First Constructor");
	}
	Chaining1(String s)
	{
		this();
		System.out.println("Second Constructor");
	}
	public static void main(String[] args) 
	{
		Chaining1 c= new Chaining1 ("Sriram");
	}

}
