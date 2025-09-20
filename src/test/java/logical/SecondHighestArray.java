package logical;

import java.util.Arrays;

public class SecondHighestArray 
{

	public static void main(String[] args) 
	{
		int [] num= {21,43,54,24,76,98,99,76,87,99,89,33,98,99};
//		SecondNumberWithoutduplicate(num);
		SecondNumberWithduplicate(num);
	}
	private static void SecondNumberWithduplicate(int[] num) 
	{
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for (int a: num)
		{
			if(a>first)
			{
				second=first;
				first=a;		
			}
			else if(a>second && a!=first)
			{
				second=a;
			}
		}
		System.out.println(first);
		System.out.println(second);
	}
	public static void SecondNumberWithoutduplicate(int [] arr)
	{
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}
