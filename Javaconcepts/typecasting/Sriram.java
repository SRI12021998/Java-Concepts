package typecasting;
/* we cannot do down-casting without doing up-casting
 * if we try class cast exception will be thrown line-11
*/
public class Sriram extends Balaji
{
	int age=26;
	public static void main(String[] args) 
	{
		Balaji b=new Sriram();
//		Balaji b=new Balaji();
		if (b instanceof Sriram)
		{
		Sriram s=(Sriram) b;//down-casting
		s.working();
		s.investing();
		System.out.println(s.age);
		b.working();
		System.out.println(b.age);
		}
		else
		{
			System.out.println("not is a relationship");
		}
	}
	public void working()
	{
		System.out.println("QA");
	}
	public void investing()
	{
		System.out.println("SM");
	}
}
