package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MovingOddEven 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the total number of input");
		//Storing the total array length
		int length=scanner.nextInt();
		int []input=new int[length];
		//Initializing input array values
		for (int i=0;i<length;i++)
		{
			System.out.println("Please enter the input values one by one;");
			input[i]=scanner.nextInt();
		}
		System.out.println("Input:");
		System.out.println(Arrays.toString(input));
		System.out.println("Output:");	
		System.out.println(movingOddEven(input));
	}
	public static ArrayList<Integer> movingOddEven(int[] input)
	{
		int a=0;
		int b=input.length-1;
		int []output=new int[input.length];
		for(int i=0;i<output.length;i++)
		{
			int j=i+1;
			for(int k=0;k<output.length;k++)
			{
				if(j<output.length&&output[i]>output[j])
					{
						int temp=output[j];
						output[j]=output[i];
						output[i]=temp;
					}
				j++;
			}
		}
		for (int i=0;i<output.length;i++)
		{
			if(input[i]%2==0)//even
				{
					output[b]=input[i];
					b--;
				}
			else if(input[i]%2!=0)//odd
				{
					output[a]=input[i];
					a++;
				}
		}
		a=0;
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		for(int z=0;z<output.length;z++)
		{
			if(output[a]%2==0)
				{
					even.add(output[a]);
					a++;
				}
			else
				{
					odd.add(output[a]);
					a++;
				}
		}
		Collections.sort(even);
		Collections.sort(odd);
		ArrayList<Integer> finalOutput=new ArrayList<>();
		finalOutput.addAll(odd);
		finalOutput.addAll(even);
		return finalOutput;
	}
}


