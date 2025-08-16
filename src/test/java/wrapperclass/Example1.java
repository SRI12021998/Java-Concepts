package wrapperclass;

public class Example1 
{

	public static void main(String[] args) 
	{
		int a=10;
		double d=93.5;
		Integer i=a;//boxing
		Double d1=d;//boxing

		int b=i;//unboxing
		System.out.println(b);
		double c=d1;//unboxing
		System.out.println(c);

		String s="9791438607";
		long l=Long.parseLong(s);//parsing
		System.out.println(l);

		String s2="93.5";
		float f=Float.parseFloat(s2);//parsing
		System.out.println(f);
		
		Integer i2=null;//can store null values
		System.out.println(i2);

		Integer i3=new Integer(8);
		System.out.println(i3);
		int i4=i3;//unboxing or i3.intValue();
		System.out.println(i4);
	}

}
