package typecasting;

public class Divya extends Balu
{
	int age=25;
	public static void main(String[] args) 
	{
		Balu b=new Divya();//up-casting
		System.out.println(b.age);
		b.exercise(); //overriden method in child class will be considered
		Divya d=(Divya)b; //down-casting
		d.work(); //method from child class
		System.out.println(d.age); //accessing child class variable
	}
	public void exercise()
	{
		System.out.println("butterfly");
	}
	public void work()
	{
		System.out.println("Working");
	}
	
}
