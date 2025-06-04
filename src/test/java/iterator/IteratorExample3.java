package iterator;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class IteratorExample3 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> automate=new TreeMap<>();
		automate.put(1, "input-user");
		automate.put(2, "input-password");
		automate.put(3, "login-button");
		automate.put(4, "Tenant-menu");
		Iterator<Integer> itr3=automate.keySet().iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		Iterator<String> itr4=automate.values().iterator();
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		Iterator<Entry<Integer, String>> itr5=automate.entrySet().iterator();
		while (itr5.hasNext())
		{
			System.out.println(itr5.next());
		}

	}

}
