package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet2 
{

	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		int[] arr= {10,4,7,10,3,4};
		ArrayList <Integer> ranks=new ArrayList();
		for (int i=0;i<arr.length;i++)
		{
			lhs.add(arr[i]);
		}
		System.out.println(lhs);
	}

}
