package aggregation;

public class AggregationExample 
{

	public static void main(String[] args) 
	{
		Passenger passenger=new Passenger ("Sriram", 27,7010887596l);
		passenger.displayPassengerDetails();//independent relationship or weak has a relation
		Train train=new Train(66270, "Mysore express", passenger);
		train.displayJourneyDetails();
		System.out.println("------");
		Train train2=new Train(66270, "Mysore express", null);
		train2.displayJourneyDetails();
	}

}
