package collection;

import java.util.HashSet;

public class HashSet1 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet();
//		hs.add("Sriram");
		hs.add(27);
//		hs.add("Divya Priya");
		hs.add(26);
		hs.add(27);//duplicates cannot be inserted
		System.out.println(hs);
	}

}
