package rough;

import java.util.ArrayList;

public class Test4 
{

	public static void main(String[] args) 
	{
		String str="Today, is the greatest day ever!";
		ArrayList<String> words=Test4.splitWord(str);
		words.forEach(word->System.out.print(word+" | "));
	}

	private static ArrayList<String> splitWord(String str) 
	{
		String temp=str;
		ArrayList<String> op=new ArrayList<>();
		while(temp.contains(" "))
		{
			int lastIndex = temp.indexOf(' ');
			if(lastIndex!=-1)
			{
				op.add(temp.substring(0,lastIndex));
				temp=temp.substring(lastIndex+1,temp.length());
			}
		}
		op.add(temp);
		return op;
	}

}
