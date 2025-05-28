package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 
{

	public static void main(String[] args) 
	{
		int[] arr= {10,4,7,10,3,4};
		ArrayList <Integer> ranks=new ArrayList();
		for (int i=0;i<arr.length;i++)
		{
			ranks.add(arr[i]);
		}
		System.out.println("Ranks before removing duplicates "+ranks);
		HashSet <Integer> hs=new HashSet();//or HashSet <Integer> hs=new HashSet(ranks);
		hs.addAll(ranks);//removed duplicates since it will not allow
		System.out.println("Ranks after removing duplicates "+hs);
		
	}

}
