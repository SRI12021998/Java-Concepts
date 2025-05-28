package iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample 
{

	public static void main(String[] args) 
	{
		LinkedList<Long> numbers=new LinkedList<>();
		numbers.add(9791438607l);
		numbers.add(7010887596l);
		numbers.add(9442777078l);
		numbers.add(9442777078l);
		ListIterator <Long> litr=numbers.listIterator(numbers.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		ListIterator <Long> litr2=numbers.listIterator();
		while(litr2.hasNext())
		{
			if(litr2.next().equals(7010887596l))
			{
				litr2.add(8870132025l);
			}
		}
		System.out.println(numbers);
		ListIterator <Long> litr3=numbers.listIterator();
		while(litr3.hasNext())
		{
			if(litr3.next().equals(7010887596l))
			{
				litr3.set(null);
			}
		}
		System.out.println(numbers);
	}

}
