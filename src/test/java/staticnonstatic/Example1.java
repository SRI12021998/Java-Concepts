package staticnonstatic;

public class Example1 
{
	//non static block will be called when object is created
	{
		System.out.println("hi from non static");//3//5
		test();
		test2();
	}
	//first static block will be called before methods
	static
	{
		System.out.println("hi from static");//1
		test();	
	}
	//will be called at last
	Example1()
	{
		System.out.println("hi from constructor");//4//6
		test();
		test2();
	}
	public static void main(String[] args) 
	{
		System.out.println("hi from main static method");//2
		Example1 e=new Example1();
		Example1 e1=new Example1();
		test();
	}
	public static void test()
	{
		System.out.println("hi from static method");//7
	}
	public void test2()
	{
		System.out.println("hi from non static method");//7
	}
	public void test3()
	{
		System.out.println("hi from non static method3");//7
		test2();
	}
}
