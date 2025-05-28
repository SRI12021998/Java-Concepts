package aggregation;
/*
 *  If you pass the child object as a parameter, it is Aggregation 
 *  because the child object is created externally and assigned to the parent.
 *  If the child object can exist independently, it is Aggregation.
 */

public class Train 
{
	String trainName;
	int trainNo;
	Passenger passenger;//has a relationship
	public Train( int trainNo, String trainName,Passenger passenger)
	{
		this.trainName=trainName;
		this.trainNo=trainNo;
		this.passenger=passenger;
	}
	public void displayJourneyDetails()
	{
		System.out.println("Train Name - "+trainName);
		System.out.println("Train Number - "+trainNo);
		if (passenger!=null)
		{
			passenger.displayPassengerDetails();
		}

	}
	public void displayTrainDetails()
	{
		System.out.println("Train Name - "+trainName);
		System.out.println("Train Number - "+trainNo);
	}
}
