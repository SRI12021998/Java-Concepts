package object;

public class Example 
{
	int price;
	public static void main(String[] args) 
	{
		Example e=new Example();
		System.out.println(e);
		e.price=20;
		System.out.println(e.hashCode());
		
		Example e2= new Example();//every child object is an object of parent class
		e2.price=20;
		if (e.equals(e2))//equals() called by e --> argument e2
		{
			System.out.println("equal object");
		}
		else
		{
			System.out.println("not equal object");
		}
//		if (e.price==e2.price)
//		{
//			System.out.println("equal value");
//		}
//		else
//		{
//			System.out.println("not equal value");
//		}
	}
	public String toString()//1st priority is for child class overridden method
	{
		return "Hello";
	}
	public boolean equals(Object o)
	{
		Example e2=(Example) o;//type casting changing the example class object as object class object
		if(this.price==e2.price)
		{
		return true;
		}
		else 
		{
		return false;
		}
	}
	public int hashCode()
	{
		return 1;
	}
	
}
