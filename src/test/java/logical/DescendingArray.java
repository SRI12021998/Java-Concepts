package logical;

public class DescendingArray 
{
	public static void main(String[] args) 
	{
		int[]arr= {90,10,56,23,73,12,54,83,45};
		int temp;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
