package scanner;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileScanner 
{

	public static void main(String[] args) 
	{
		try {
			Scanner scn=new Scanner(new File("D:\\XMLCNz.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not downloaded");
		}
	}

}
