package array;

import java.util.Scanner;

public class ArrayExample1 
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int a[]=new int[5];
		int i=0;
		while (i<a.length)
		{
			System.out.println("Enter value");
			a[i]=scn.nextInt();
			i++;
		}
		for (int b:a)
		{
			System.out.println(b);
		}
	}

}
