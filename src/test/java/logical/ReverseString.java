package logical;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		String input="This is a trial";
		ReverseString.reverseString(input);
		
	}
	public static void reverseString(String input)
	{
		StringBuffer output=new StringBuffer();
		for(int i=input.length()-1;i>=0;i--)
		{
			output.append(input.charAt(i));
		}
		System.out.println(output);
	}
}
