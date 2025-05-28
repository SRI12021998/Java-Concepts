package logical;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZero 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers need to be arranged");
		int totalNo=scanner.nextInt();
		int[]arr=new int[totalNo];
		for (int j=0;j<totalNo;j++)
		{
			System.out.println("Please enter the numbers one by one");
			arr [j]=scanner.nextInt();
		}
		scanner.close();
		int[]result=movingZero(arr);
		System.out.println("Input:");
//		for (int x:arr)
//		{
//			System.out.print(x);
//		}
//		System.out.println("");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output:");
//		for (int z:result)
//		{
//			System.out.print(z);
//		}
		System.out.println(Arrays.toString(result));
	}
	public static int[] movingZero(int[] arr)
	{
		int[] result=new int[arr.length];
		int a=1;
		int b=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==0)
			{
				result[arr.length-a]=arr[i];
				a++;
			}
			else if (arr[i]!=0)
			{
				result[b]=arr[i];
				b++;
			}
		}
		return result;
	}
	
}
