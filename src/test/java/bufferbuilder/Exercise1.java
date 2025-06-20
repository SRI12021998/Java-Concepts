package bufferbuilder;

public class Exercise1 
{
/*string buffer & builder are mutable 
 * buffer & builder are same buffer came in v1 builder came in v5
 * buffer is thread safe & all methods are synchronized-sequential actions
 * builder is not thread safe & all methods are non synchronized-parallel actions
 */
	public static void main(String[] args) 
	{
		String s []= {"SRI","RAM","DIVYA","PRIYA"};
		joinNames(s);
		joinNamesUsingBuffer(s);
		insertChar("i",2);
		replaceChar(1,2,"S");
		StringBuilder sb1=new StringBuilder("balaji");
		System.out.println(sb1.reverse());
	}
	private static void replaceChar(int i, int j, String s) 
	{
		StringBuffer sb=new StringBuffer("Divya");
		sb.replace(i,j,s);
		System.out.println(sb);
	}
	public static void joinNames(String[] s)
	{
		String join="";
		for (String f:s)
		{
			System.out.println(join.hashCode());
			join=join+f;
		}
		System.out.println(join);
	}
	public static void joinNamesUsingBuffer(String[] s)
	{
		StringBuffer join=new StringBuffer("");
		for (String f:s)
		{
			System.out.println(join.hashCode());
			join.append(f);
		}
		System.out.println(join);
	}
	public static void insertChar(String s, int i)
	{
		StringBuffer sb=new StringBuffer("Srram");
		sb.insert(i, s);
		System.out.println(sb);
	}
	
}
