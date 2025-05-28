package collection;

import java.util.ArrayList;

public class ArrayList2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> name=new ArrayList<>();
		name.add(1);
		name.add(3);
		name.add(5);
		name.add(7);
		System.out.println(name);
		name.add(2, 9);
		System.out.println(name);
		System.out.println(name.get(3));
		System.out.println(name.size());
		name.set(0, 99);
		System.out.println(name);
		name.remove(3);
		System.out.println(name);
		name.clear();
		System.out.println(name);
	}

}
