package collection;

import java.util.LinkedList;

public class LinkedList2 
{

	public static void main(String[] args) 
	{
		String [] input= {"Sriram","Divya","Shrideev","Balaji","Balu","Balu"};
		LinkedList<String>output=LinkedList2.addObjects(input);
		System.out.println(output);
	}
	public static LinkedList<String> addObjects (String[] arr)
	{
		LinkedList<String> ll=new LinkedList<>();
		for(int a=0; a<arr.length;a++)
		{
			ll.add(arr[a]);
		}
		return ll;
	}
}
