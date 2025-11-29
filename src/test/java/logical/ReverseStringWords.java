package logical;

public class ReverseStringWords 
{

	public static void main(String[] args) 
	{
		String input="This is a trial";
		String[]str=input.split(" ");
		StringBuffer temp=new StringBuffer();
		String output="";

		for (int i=0;i<str.length;i++)
		{
			temp.append(str[i]);
			temp.reverse();
			str[i]=String.valueOf(temp);
			temp.delete(0, temp.length());
			
			output=output+str[i]+" ";
		}
		output.trim();
		System.out.println(output);
	}

}
