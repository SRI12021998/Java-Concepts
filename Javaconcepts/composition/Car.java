package composition;
//If the Car is destroyed, the Engine is also destroyed (Engine cannot exist alone).
public class Car 
{
	String carName;
	String carType;
	Engine engine;
	public Car (String carName, String carType)
	{
		this.carName=carName;
		this.carType=carType;
		this.engine=new Engine(6,"4Stroke");//Composition
	}
	public void starCar()
	{
		System.out.println("Car Starting");
		engine.startEngine();
	}
}
