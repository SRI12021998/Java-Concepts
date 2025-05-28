package controlstatements;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		int actualStock=100;
		Scanner s=new Scanner(System.in);
		int unloadStock=s.nextInt();
		do
		{
			System.out.println("Extra stocks");
			unloadStock--;
		}
		while (unloadStock>actualStock);
	}
}
