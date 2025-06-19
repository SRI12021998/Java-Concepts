package controlstatements;

public class Ternary 
{

	public static void main(String[] args) 
	{
		String s="gov inda.txt";
		String a=s.substring(8);
		boolean t=(a==".txt")?true:false;//wrong we cannot compare string like this
		System.out.println(t);
		String p=(a.equals(".txt"))?"ama":"ila";
		System.out.println(p);
	}

}
