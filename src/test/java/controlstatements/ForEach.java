package controlstatements;

public class ForEach //its a unidirectional loop will go only forward
{

	public static void main(String[] args) 
	{
		String[] name= {"SRI","RAM","DIVYA","PRIYA"};
		int[] pm= {1,2,3,4,5,6,7,8,9,10,19,21,23,24,25,39};
		for (String s:name)
		{
			System.out.println(s);
		}
		
		for (int a:pm)
		{
			if(a==19)
			{
			System.out.println(a);
			}
		}
	}

}
