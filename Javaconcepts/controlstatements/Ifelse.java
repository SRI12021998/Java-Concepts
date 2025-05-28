package controlstatements;
import java.util.Scanner;
public class Ifelse 
{

	public static void main(String[] args) 
	{
		int skuA=25;
		Scanner s=new Scanner(System.in);
		int orderQty=s.nextInt();
		s.close();
		if (skuA>=orderQty)
		{
			skuA=skuA-orderQty;
			System.out.println("Allocation completed");
		}
		else if(skuA<orderQty&&skuA!=0)
		{
				skuA=0;
			System.out.println("Partially completed");
		}
		else
		{
			System.out.println("Stocks not available");
		}
		System.out.println("Available Stocks "+skuA);
	}

}
