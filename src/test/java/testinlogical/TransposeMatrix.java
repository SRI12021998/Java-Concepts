package testinlogical;

public class TransposeMatrix 
{
	public static void transpose(String[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=input[i].replaceAll("[()]", "");
		}
		
		String [] firstRow=input[0].split(",");
		int[][]output=new int[firstRow.length][input.length];
		
		for(int i=0;i<output.length;i++)
		{
			for(int j=0;j<output[i].length;j++)
			{
				String [] temp=input[j].split(",");
				output[i][j]=Integer.parseInt(temp[i]);
			}
		}
		
		for( int a=0;a<output.length;a++)
		{
			for (int b=0;b<output[a].length;b++)
			{
				System.out.print(output[a][b]);
				if(b<output[a].length-1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		String [] target= {"(1,2,3)","(4,5,6)","(7,8,9)","(10,11,12)"};
		transpose(target);
	}

}
