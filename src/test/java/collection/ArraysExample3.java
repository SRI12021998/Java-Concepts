package collection;

import java.util.Arrays;

public class ArraysExample3 
{

	public static void main(String[] args) 
	{
		String[]names= {"SriRam","Divya Priya","Shrideev krishna", "Balaji","Balu","Punitha","Suguntha"};
		System.out.println("Before sorting");
		for(String output: names)
		{
			System.out.print(output+" ");
		}
		Arrays.sort(names, (s1,s2)->s1.compareTo(s2));//change s1 s2 for descending
		System.out.println();
		System.out.println("After sorting");
		for(String output: names)
		{
			System.out.print(output+" ");
		}

	}

}
