package collection;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMap1 
{

	public static void main(String[] args) 
	{
		HashMap <Integer, String> map=new HashMap<>();
		map.put(3, null);
		map.put(1, "goinda");
		map.put(0, "winter");
		map.put(8, "summer");
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("winter"));
		map.remove(1);
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		HashMap  <Integer, String>map2=new HashMap<>();
		map2.put(1, "Sriram");
		map2.putAll(map);
		map.clear();
		System.out.println(map);
		System.out.println(map2);
		
		for (Entry<Integer,String> entrySet : map2.entrySet()) 
		{
			System.out.println(entrySet.getKey()+" "+entrySet.getValue());
		}
	}

}
