package rough;

import java.io.File;

import accessmodifiers.Bank;
import variables.PrimitivesNonPrimitives;

public class Rough2 extends PrimitivesNonPrimitives
{

	public static void main(String[] args) 
	{
//		int i=0;
//		File file=new File("D:\\WORKSPACE\\xls\\");
//		String[]files=file.list();
//		for (String s:files)
//		{
//			int a=s.lastIndexOf(".");
////			if(s.substring(a)==".txt");
//			System.out.println(s+" "+a);
//		}
//		String s="gov inda.txt";
//		String a=s.substring(8);
//		String t=(a==".txt")?"true":"false";
//		System.out.println(t);
		Object o=new Object();
		Rough2 r=new Rough2();
//		r.accountOpening();
//		r.balanceEnquiry();
		PrimitivesNonPrimitives p=new PrimitivesNonPrimitives();
		System.out.println(p.test);
		try {
			o.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r.test2);
	}

}
