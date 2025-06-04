package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class IteratorExample 
{

	public static void main(String[] args) 
	{
		ArrayList < String> names=new ArrayList<>();
		names.add("Chandler");
		names.add("Joey");
		names.add("Ross");
		names.add("Monica");
		names.add("Phoebie");
		names.add("Rachel");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(temp.equals("Phoebie"))
			{
				itr.remove();
			}
			System.out.println(temp);
		}
		System.out.println(names);
		LinkedList<Long> numbers=new LinkedList<>();
		numbers.add(9791438607l);
		numbers.add(7010887596l);
		numbers.add(9442777078l);
		numbers.add(9442777078l);
		HashSet <Object> alphanumeric=new HashSet<>();
		alphanumeric.add(12);
		alphanumeric.add("Sriram");
		alphanumeric.add("Apple");
		alphanumeric.add("Ball");
		alphanumeric.add(10);
		LinkedHashSet<Long> setnumbers=new LinkedHashSet<>();
		setnumbers.addAll(numbers);
		TreeSet<String> bank=new TreeSet<>();
		bank.add("HDFC");
		bank.add("TDCC");
		bank.add("IPPB");
		bank.add("IOB");
		HashMap <Integer,String> vehicle=new HashMap<>();
		vehicle.put(50, "CD-Deluxe");
		vehicle.put(40, "FZ");
		vehicle.put(null,"aether");
		vehicle.put(45, "Jupiter");
		LinkedHashMap <Integer,String> relation=new LinkedHashMap<>();
		relation.put(1, "Child");
		relation.put(1, "Father");
		relation.put(1, "Grandfather");
		relation.put(1, "GreatGrandfather");
		
	}

}
