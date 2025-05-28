package typecasting;

public class Example1 
{
	//converting one data type to another data type
	public static void main(String[] args) 
	{
		int a=5;
		double b=a;//widening/implicit/automatic typecasting
		//byte-short-int-long-float-double
		long c=7010887596l;
		int d=(int) c;//narrowing/explicit typecasting
		System.out.println(d);
		double e=98.95;
		int f=(int)e;
		System.out.println(f);
	}
}
