package testinlogical;

import java.util.ArrayList;

public class PrimeNumberFind 
{

	public static void main(String[] args) 
	{
		int limit=100000;
		ArrayList<Integer> output=new ArrayList<>();
		
		//basic logic checks from half of the number to 1
//		for(int i=2;i<=limit;i++)
//		{
//			for(int j=i/2;j>0;j--)
//			{
//				if(i%j==0&&j==1)
//				{
//					output.add(i);
//					break;
//				}
//				else if(i%j==0&&j!=1)
//				{
//					break;
//				}
//			}
//		}
		
		//advanced logic checks from 2 up to square root of the number
		for (int i = 2; i <= limit; i++) 
		{
		    boolean isPrime = true;

		    for (int j = 2; j <= Math.sqrt(i); j++) 
		    {
		        if (i % j == 0) 
		        {
		            isPrime = false;
		            break;
		        }
		    }

		    if (isPrime)
		        output.add(i);
		}
		
		
		System.out.println(output);
	}

}
