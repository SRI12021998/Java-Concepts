package testinlogical;

public class MatrixRotate 
{
	public static void rotateClockwise(String []input)
	{
		
		for(int i=0;i<input.length;i++)
		{
			input[i]=input[i].replaceAll("[()]", "");
		}
		
		String [] firstRow=input[0].split(",");
		int [][] space=new int[input.length][firstRow.length];
		
		for(int i=0;i<input.length;i++)
		{
			String [] temp=input[i].split(",");
			for(int j=0;j<firstRow.length;j++)
			{
				space[i][j]=Integer.parseInt(temp[j]);
			}
		}
		
		int [][]output=new int[firstRow.length][input.length];
		int a=input.length-1;
		int b=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<firstRow.length;j++)
			{
				output[i][j]=space[i+a][j+b];
				
				if(j<firstRow.length-1)
				{
					a--;
					b--;
				}
			}
			a=a+2;
			b=b+4;
		}
		
		
//        for(int i = 0; i < input.length; i++) {
//            for(int j = 0; j < input.length; j++) {
//                output[j][input.length - 1 - i] = space[i][j];
//            }
//        }
//		
		
		System.out.println("Input matrix:");
        for(int[] row : space) 
        {
            for(int val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
		
        System.out.println("Output matrix after 90 degree clockwise rotation:");
        for(int[] row : output) 
        {
            for(int val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) 
	{
		String [] target= {"(1,2,3,8)","(4,5,6,5)","(7,8,9,4)","(32,12,42,56)"};
		rotateClockwise(target);
	}

}
