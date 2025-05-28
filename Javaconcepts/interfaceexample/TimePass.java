package interfaceexample;
/*All fields in an interface are public, static, and final by default.
 * has a relationship
 */
public class TimePass implements Extrovert, Introvert
{

	public static void main(String[] args) 
	{
		TimePass t= new TimePass();
		t.travel();
		System.out.println("Riding in "+t.vehicle());
		System.out.println(Extrovert.KM);//can be called using interface name
		System.out.println(TimePass.KM);//static data members can be called with class name
		System.out.println(t.KM);//can be called using class object reference
		t.watchingTv();
		System.out.println("Playing with "+t.playingGames());
//		t.km=9; cannot change final variable
		Extrovert e=new TimePass();// Dynamic binding
		e.travel();
		System.out.println("Riding in "+e.vehicle());
		System.out.println(Extrovert.KM);
		System.out.println(e.KM);
		Introvert i=new TimePass();// Dynamic binding
		i.watchingTv();
		System.out.println("Playing with "+i.playingGames());
		System.out.println(Introvert.NOOFHRS);
		System.out.println(i.NOOFHRS);
	}
	public void travel() 
	{
		System.out.println("Travelling to chennai");
		
	}
	public String vehicle() 
	{
		return "bike";
	}
	@Override
	public void watchingTv() 
	{
		System.out.println("Watching GOT");
	}
	@Override
	public String playingGames() 
	{
		return "PC";
	}

}
