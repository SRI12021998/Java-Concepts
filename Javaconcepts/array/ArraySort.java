package array;

public class ArraySort 
{

	public static void main(String[] args) 
	{
		int[]arr= {90,10,56,23,73,12,54,83,45};
		int temp;
		for (int i=0;i<arr.length;i++)//bubble sort
		{
			int a=0;
			while(a+1<arr.length)
			{
				if (arr[a]>arr[a+1])
				{
					temp=arr[a+1];
					arr[a+1]=arr[a];
					arr[a]=temp;
				}
				a++;
			}
		}
		for (int result:arr)
		{
			System.out.print(result+" ");
		}
	}

}
