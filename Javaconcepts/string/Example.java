package string;

public class Example 
{

	public static void main(String[] args) 
	{
		/*string class is inside java.lang package
		 * so no need to import
		 */
		String s=new String ();
		//string class can be created without adding new -specialty
		String s2="as";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		//string is immutable will be stored in string constant pool scp present in heap
		s2="df";
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}

}
