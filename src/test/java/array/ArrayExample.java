package array;

public class ArrayExample 
//collection of similar datatypes
//data will be store continously 
{
	public static void main(String[] args) 
	{
		//method1
		int[] number= {1,2,3,4,5,5};
		String[] name= {"SRI","RAM","DIVYA","PRIYA"};
		double [] percent= {22.43,11.42,98.43,87.48};
		char[] initial= {'a','b','c','d','e'};
		for (int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		//method2
		int[]number1=new int[6];
		String[] name1= new String[5];
		double [] percent1= new double[5];
		char[] initial1= new char[5];
		
		for (int j=0;j<number.length;j++)
		{
			number1[j]=number[j];
		}
		for (int a:number1)
		{
			System.out.print(a);
		}
		System.out.println();
		for (int j=0;j<name.length;j++)
		{
			name1[j]=name[j];
		}
		for (String a:name1)
		{
			System.out.print(a);
		}
	}
}
