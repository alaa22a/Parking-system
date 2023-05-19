import java.util.*; 
public class FirstSlot extends ParkIn{
	
	public Boolean parkInApproach(Vehicle vehicle,List<Slot>slots)
	{
		int Vdimensions = vehicle.getDepth()*vehicle.getWidth() ;	// depth*width
		int Sdimensions;
		
		int i=0;
		for(Slot s : slots)
		{
			if(vehicle.getDepth() <= s.getSlotDepth() && vehicle.getWidth()<=s.getSlotWidth())
			{
				// set the garage that we have chosen off 
				slots.set(i, slots.get(i) .setOff());
				
				// save the slot id into the vehicle information
				vehicle.setSlotid( slots.get(i).getId() );

				return true;
			}
			i++;
		}
		
		// no such dimensions
		return false;
	}
}
