package deepshallowcopies;

public class DeepCopy 
{
		String s="Balaji";
	public static void main(String[] args) 
	{
		DeepCopy d1=new DeepCopy();
		DeepCopy d2=new DeepCopy();
		d1.s="Sriram";
		System.out.println(d1.s);
		System.out.println(d2.s);
	}

}
