package staticnonstatic;

public class Example1 
{
	//non static block will be called when object is created
	{
		System.out.println("hi from non static block");//4//10
		test();
		test2();
	}
	//first static block will be called before methods
	static
	{
		System.out.println("hi from static block");//1
		test();	
	}
	//will be called at last
	Example1()
	{
		System.out.println("hi from constructor");//7//13
		test();
		test2();
	}
	public static void main(String[] args) 
	{
		System.out.println("hi from main static method");//3
		Example1 e=new Example1();
		Example1 e1=new Example1();
		test();
	}
	public static void test()
	{
		System.out.println("hi from static method i'll be coming before main method");//2//5//8//11//14//16
	}
	public void test2()
	{
		System.out.println("hi from non static method");//6//9//12//15
	}
	public void test3()
	{
		System.out.println("hi from non static method3");//
		test2();
	}
}
