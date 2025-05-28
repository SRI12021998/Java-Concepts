package logical;

public class ReverseStringArray 
{
	public static void main(String[] args) 
	{
		String input="HELLO";
		char []arr=input.toCharArray();
		int j=arr.length-1;
		for(int i=0;i<j;i++)
		{
			char temp=arr[j];//3
			arr[j]=arr[i];//3=2
			arr[i]=temp;//2=3
			j--;//3->2
		}
		System.out.println(arr);
	}
}
