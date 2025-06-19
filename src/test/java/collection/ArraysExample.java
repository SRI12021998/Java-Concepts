package collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample implements Comparator
{

	public static void main(String[] args) 
	{
		int[]arr= {1,3,61,254,75,12,4,6,7};
		int[]arr1= {1,3,61,254,75,12,4,9,7};
		System.out.println(Arrays.equals(arr, arr1));//only checks the same elements are there or not
		Arrays.sort(arr);//sorts in ascending
		for(int result:arr)
		{
			System.out.print(result+" ");
		}
		System.out.println();
		Comparator ae=new ArraysExample();
		String[]names= {"SriRam","Divya Priya","Shrideev krishna", "Balaji","Balu","Punitha","Suguntha"};
		System.out.println("Before sorting");
		for(String output: names)
		{
			System.out.print(output+" ");
		}
		Arrays.sort(names, ae);
		System.out.println();
		System.out.println("After sorting");
		for(String output: names)
		{
			System.out.print(output+" ");
		}
	}

	public int compare(Object o1, Object o2) 
	{
		String s1=(String) o1;//type casting
		String s2=String.valueOf(o2);//o2.toString();
		if(s1.length()>s2.length())
			return 1;//Ascending with length if need change negative for descending
		else if (s1.length()<s2.length())
			return -1;//Ascending with length if need change positive for descending
		else
			return 0;
	}

}
