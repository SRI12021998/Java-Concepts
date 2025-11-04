package testinlogical;

public class MatrixDiagonal 
{
	public static String DiagonalCheck(String [] input)
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=input[i].replaceAll("[()]", "");
		}
		String [] firstRow=input[0].split(",");
		
		if(firstRow.length!=input.length)
		{
			return "not a square matrix";
		}
		
		int[][] space=new int[input.length][firstRow.length];
		
		for (int a=0;a<input.length;a++)
		{
			String [] temp=input[a].split(",");
			for (int b=0;b<input.length;b++)
			{
				space[a][b]=Integer.parseInt(temp[b]);
			}
		}
		
		int rd=0;
		int ld=0;
		int point=0;
		for(int x=0;x<space.length;x++)
		{
			point++;
			rd=rd+space[x][space.length-point];
		}
		for(int x=0;x<space.length;x++)
		{
			ld=ld+space[x][space.length-point];
			point--;
		}
		System.out.println("Right side diagonal "+rd);
		System.out.println("Left side diagonal "+ld);
		
//		for (int a=0;a<input.length;a++)
//		{
//			for (int b=0;b<input.length;b++)
//			{
//				System.out.print(space[a][b]);
//				if(b<input.length-1)
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		if(rd==ld)
		{
			return "Both side diagonals are same";
		}
		else
		{
			return "diagonals are not same";
		}
	}
	public static void main(String[] args) 
	{
		String [] target= {"(1,2,3,8)","(4,5,6,5)","(7,8,9,4)","(32,12,42,56)"};
		System.out.println(DiagonalCheck(target));
	}
}
