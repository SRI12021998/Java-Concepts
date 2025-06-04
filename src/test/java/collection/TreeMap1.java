package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, String>tm=new TreeMap<>();
		tm.put(26,"Divya priya");
		tm.put(27, "Sriram");
		tm.put(58, "Balaji");
		tm.put(51, "Punitha");
		tm.put(27, "venky");//overwrite due to duplicate key
//		tm.put(null, "g");
		System.out.println(tm.entrySet());
		for(Map.Entry<Integer, String> value: tm.entrySet())//map&entry is interface -nested
			{
				System.out.println(value.getKey());
				System.out.println(value.getValue());
			}
	}

}
