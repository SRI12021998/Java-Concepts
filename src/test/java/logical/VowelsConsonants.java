package logical;

public class VowelsConsonants 
{

	public static void main(String[] args) 
	{
		String input="This is a testing program";
		int vowelsCount=0;
		int consonantsCount=0;
		char [] vowels= {'A','E','I','O','U'};
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				if(input.toUpperCase().charAt(i)==vowels[j])
				{
					vowelsCount++;
				}
			}
		}
		consonantsCount=input.length()-vowelsCount;
		System.out.println("No. of vowels - "+vowelsCount);
		System.out.println("No. of consonants - "+consonantsCount);
	}

}
