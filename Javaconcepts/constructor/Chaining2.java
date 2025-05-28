package constructor;

public class Chaining2 extends Chaining1
{
	Chaining2()
	{
		super("Sriram");
		System.out.println("Child's First Constructor");
	}

	public static void main(String[] args) 
	{
		Chaining2 c2=new Chaining2();
	}

}
