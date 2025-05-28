package gettersetter;

public class TopSoe 
{

	public static void main(String[] args) 
	{
		Ivy i=new Ivy();
		System.out.println(i.getMinPackage());
		System.out.println(i.getWorkHrs());
		i.setWorkHrs(6);
		System.out.println(i.getWorkHrs());
	}

}
