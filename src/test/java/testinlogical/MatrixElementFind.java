package testinlogical;

public class MatrixElementFind 
{
	public static String findElement(String [] input, int value)//ONLY TO FIND FIRST OCCURENCE
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=input[i].replaceAll("[()]", "");
		}
		String[] firstRow=input[0].split(",");
		int [][] space=new int[input.length][firstRow.length];
		
		for(int i=0;i<input.length;i++)
		{
			String [] temp=input[i].split(",");
			for(int j=0;j<firstRow.length;j++)
			{
				space[i][j]=Integer.parseInt(temp[j]);
			}
		}
		
		for (int a=0;a<input.length;a++)
		{
			for (int b=0;b<firstRow.length;b++)
			{
				
				if(space[a][b]==value)
				{
					return "Element found at row "+(a+1)+", column "+(b+1);
				}
			}
		}
		
		return "Element not found";
	}

	public static void main(String[] args) 
	{
		String [] target= {"(1,2,3,91)","(4,5,6,72)","(7,8,9,53)"};
		int value=728;
		System.out.println(findElement(target, value));
	}

}
