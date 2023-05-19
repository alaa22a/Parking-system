import java.util.*; 
public class ParkingSystem {
	private Relation relation=new Relation();
	private ParkIn parkIn;
	private Time time=new Time();
	
	// the main parking function 
	public void parkIn()
	{
		// create a new vehicle to park it
		Vehicle newVehicle=new Vehicle();
		relation.inputVehicle(newVehicle);
		// the vehicle is now ready to be parked
		
		// creating the park in approach according to the current configuration.
		if(DataBase.configurationType==1)
		{
			parkIn=new FirstSlot();
		}
		else
		{
			parkIn=new BestFit();
		}
		
		if(parkIn.parkInApproach(newVehicle, DataBase.slots))
		{
			// mark arrival time and set it to the vehicle informations
			newVehicle.setArrivalTime(time.getTime());
			
			// add the vehicle to our list of parked vehicle
			DataBase.vehicles.add(newVehicle);
			
			// a validation massage will be called
		}
		else
		{
			relation.noSuchDimensions();
		}
	}
}
