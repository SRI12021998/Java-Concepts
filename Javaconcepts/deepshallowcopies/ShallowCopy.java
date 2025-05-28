package deepshallowcopies;

public class ShallowCopy 
{
	String s="Sriram";
	public static void main(String[] args) 
	{
		ShallowCopy s1=new ShallowCopy();
		ShallowCopy s2=s1;
		s2.s="Shrideev";
		System.out.println(s1.s);
		System.out.println(s2.s);
	}
}
