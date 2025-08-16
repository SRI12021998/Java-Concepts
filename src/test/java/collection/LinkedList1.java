package collection;
import java.util.*;

public class LinkedList1 
{

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("Divya priya");
		l.addFirst("Sriram");
		l.add("Balu");
		l.add("Balaji");
//		System.out.println(l);
//		l.poll();
//		System.out.println(l);
//		l.offer("Sriram");
		LinkedList l2=(LinkedList)l.clone();
//		System.out.println(l);
//		l.clear();
//		System.out.println(l);
//		System.out.println(l2);
		// System.out.println(l2);
		// for(Object option:l)
		// {
		// 	if (option.equals("Sriram"))
		// 	{
		// 		l.remove(option);
		// 	}
		// }
		
		// System.out.println(l2);
		for(Object option:l)
		{
			System.out.println(option.toString());
		}
		System.out.println("-----------------");
		Iterator<String> itr= l.iterator();
		while (itr.hasNext()) 
		{
			if(itr.next().toString().equals("Sriram"))
			{
				itr.remove();
			}
		}
		for(Object option:l)
		{
			System.out.println(option.toString());
		}
		
	}

}
