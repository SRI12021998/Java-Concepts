package controlstatements;
import java.util.Scanner;
public class WhilLoop 
{

	public static void main(String[] args) 
	{
		int actualStock=100;
		Scanner s=new Scanner(System.in);
		int unloadStock=s.nextInt();
		while (unloadStock>actualStock)
		{
			System.out.println("Extra stocks");
			unloadStock--;
		}

	}

}
