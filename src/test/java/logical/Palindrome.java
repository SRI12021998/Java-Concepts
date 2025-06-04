package logical;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println(Palindrome.palindromeCheck("MALAYALAM"));
	}
	public static boolean palindromeCheck(String input)
	{
		StringBuilder change=new StringBuilder(input);
		change.reverse();
		return input.equals(change.toString());
	}
}
