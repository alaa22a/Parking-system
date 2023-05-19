import java.util.*; 
public class BestFit extends ParkIn{
	
	public Boolean parkInApproach(Vehicle vehicle,List<Slot>slots)
	{
		int Vdimensions = vehicle.getDepth()*vehicle.getWidth() ;	// depth*width
		int Sdimensions;
		
		int index=0;// the index  where the vehicle is going to park
		int currentBestDimensions=0;
		Boolean found=false;
		
		int i=0;
		for(Slot s:slots)
		{
			
			Sdimensions=s.getSlotDepth()*s.getSlotWidth();
			if(vehicle.getDepth() <= s.getSlotDepth() && vehicle.getWidth()<=s.getSlotWidth() )
			{
				if(!found)
				{
					currentBestDimensions = Sdimensions;
					found=true;
					index=i;
				}
				else
				{
					// don't modify the best dimensions without checking
					if(Sdimensions<currentBestDimensions)
					{
						currentBestDimensions = Sdimensions;
						index=i;
					}
				}
			}
			i++;
		}
		
		if(!found)
		return false;// there is no slot with such dimensions
		
		// set the garage that we have chosen off 
		slots.set(index, slots.get( index).setOff());
		
		// save the slot id into the vehicle information
		vehicle.setSlotid( slots.get(index) .getId() );
		
		return true;
	}
}
