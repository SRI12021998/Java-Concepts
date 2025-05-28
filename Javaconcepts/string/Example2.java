package string;

public class Example2 
{

	String name;
	public Example2(String name) 
	{
		this.name=name;
	}
	public String toString()//changing the return value by overriding
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		// tostring method will be called automatically whenever we print object reference
		String s="sriram";
		System.out.println(s);
		Example2 s2=new Example2("divya");
		System.out.println(s2);
	}

}
