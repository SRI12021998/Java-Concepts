package collection;
import java.util.ArrayList;
public class ArrayList1
{
/*
 * add, addall, remove, set, clear
 */
	public static void main(String[] args) 
	{
		ArrayList names=new ArrayList();
		names.add("Sriram");
		names.add("Divya priya");
		names.add(12);
		names.add(3.91);
		names.add(null);
		ArrayList names2=new ArrayList();
		names2.addAll(names);
		System.out.println(names.get(0));
		System.out.println(names);
		System.out.println(names.contains("Sriram"));
		System.out.println(names.size());
		names.remove("Sriram");
		names.remove(1);
		System.out.println(names);
		names.clear();
		System.out.println(names);
		System.out.println(names2);
		names2.forEach( name -> System.out.println(name));
	}
	

}
