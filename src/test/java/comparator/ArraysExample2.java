package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExample2 implements Comparator
{

	public static void main(String[] args) 
	{
		Comparator c=new ArraysExample2();
		String []names={"Sriram","DivyaPriya","Shrideevkrishna", "Balaji","Balu","Punitha","Suguntha"};
		System.out.println("Before sorting");
		for(String result:names)
		{
			System.out.print(result+" ");
		}
		System.out.println();
		Arrays.sort(names, c);
		System.out.println("After sorting");
		for(String result:names)
		{
			System.out.print(result+" ");
		}
	}

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=(String)o1;
		String s2=(String)o2;
		if(s1.compareTo(s2)>0)//sorts lexicographically
		{
			return 1;//change negative for descending
		}
		else if(s1.compareTo(s2)<0)//sorts lexicographically
		{
			return -1;//change positive for descending
		}
		else
		return 0;
	}

}
