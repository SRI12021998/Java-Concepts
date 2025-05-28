package aggregation;

public class Passenger 
{
	private String passengerName;
	private int age;
	private long mobileNo;
	public Passenger (String passengerName, int age, long mobileNo)
	{
		this.passengerName=passengerName;
		this.age=age;
		this.mobileNo=mobileNo;
	}
	public void displayPassengerDetails()
	{
		System.out.println("Passenger Name - "+passengerName);
		System.out.println("Passenger Age - "+age);
		System.out.println("Passenger Contact Number - "+mobileNo);
	}
}
