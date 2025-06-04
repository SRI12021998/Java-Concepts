package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet3 
{

	public static void main(String[] args) 
	{
		String [] s1= {"Balu","Balaji","Punitha", "Suguntha", "Balu"};
		ArrayList <String> al=new ArrayList<>();
		for(int a=0;a<s1.length;a++)
		{
			al.add(s1[a]);
		}
		HashSet <String> hs=new HashSet<>();
		hs.addAll(al);
		System.out.println("Before removing duplicates");
		System.out.println(al);
		System.out.println("After removing duplicates");
		System.out.println(hs);
	}

}
