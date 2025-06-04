package rough;

public class Test3 
{

	public static void main(String[] args) 
	{
		String str="Today, is the greatest day ever!";
		System.out.println(Test3.duplicateWord(str));
	}
	
	public static String duplicateWord(String input)
	{
		String [] words=input.split(" ");
		for(String word:words)
		{
			for(int i=0;i<word.length();i++)
			{
				for(int j=i+1;j<word.length();j++)
				{
					if(word.charAt(i)==word.charAt(j))
					{
						return word;
					}
				}
			}
		}
		return "-1";
		
	}
}
