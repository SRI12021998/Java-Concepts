package testinlogical;

import java.util.ArrayList;

public class SumRowColMatrice
{
	public static void SumRowCol(String[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=input[i].replaceAll("[()]", "");
		}
		String[] firstRow = input[0].replaceAll("[()]", "").split(",");
		int [][] space=new int [input.length][firstRow.length];
		
		for(int k=0;k<input.length;k++)
		{
			String [] temp = input[k].split(",");
			
			for(int j=0;j<space[0].length;j++)
			{
				space[k][j]=Integer.parseInt(temp[j]);
			}
		}
		
		ArrayList<Integer>rowSumOutput=new ArrayList<>();
		ArrayList<Integer>colSumOutput=new ArrayList<>();
		
		for(int k=0;k<space.length;k++)
		{			
			int tempSum=0;
			for(int j=0;j<space[k].length;j++)
			{
				tempSum=tempSum+space[k][j];
			}
			rowSumOutput.add(tempSum);
		}
		
		System.out.print("Row sums: ");
		for(int o=0;o<rowSumOutput.size();o++)
		{
			System.out.print(rowSumOutput.get(o));
			if(o<rowSumOutput.size()-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
		
		for(int k=0;k<space[0].length;k++)
		{			
			int tempSum=0;
			for(int j=0;j<space.length;j++)
			{
				tempSum=tempSum+space[j][k];
			}
			colSumOutput.add(tempSum);
		}
		
		System.out.print("Column sums: ");
		for(int o=0;o<colSumOutput.size();o++)
		{
			System.out.print(colSumOutput.get(o));
			if(o<colSumOutput.size()-1)
			{
				System.out.print(", ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String [] target= {"(1,2,3,9)","(4,5,6,7)","(7,8,9,5)"};
		SumRowCol(target);
	}

}
